package org.robovm.compiler.target.framework;

import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;
import org.apache.commons.io.FileUtils;
import org.robovm.compiler.clazz.Path;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.CpuArch;
import org.robovm.compiler.config.Environment;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.AbstractTarget;
import org.robovm.compiler.target.ios.SDK;
import org.robovm.compiler.util.Executor;
import org.robovm.compiler.util.ToolchainUtil;
import org.robovm.compiler.util.XCFrameworkPlist;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.robovm.compiler.target.ios.IOSTarget.isDeviceArch;
import static org.robovm.compiler.target.ios.IOSTarget.isSimulatorArch;

public class FrameworkTarget extends AbstractTarget {

	private static final String TYPE = "framework";
	private static final String XC_TYPE = "xcframework";
	public static boolean matches(String candidate) {
		return (candidate.matches(TYPE) || candidate.matches((XC_TYPE)));
	}

    private OS os;
    private Arch arch;
    private SDK sdk;
	private boolean xcframework;

    public FrameworkTarget(String targetType) {
		this.xcframework = targetType.equals(XC_TYPE);
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public OS getOs() {
		return os;
	}

	@Override
	public Arch getArch() {
		return arch;
	}

    @Override
	public boolean canLaunch() {
		return false;
	}

    public List<SDK> getSDKs() {
        if (isSimulatorArch(arch)) {
            return SDK.listSimulatorSDKs();
        } else {
            return SDK.listDeviceSDKs();
        }
    }

	public void init(Config paramConfig) {
		super.init(paramConfig);

		os = config.getOs();
        if (os == null)
            os = OS.getDefaultOS();

        arch = config.getArch();
        if (arch == null)
            arch = new Arch(CpuArch.getDefaultArch(), Environment.Native);

		if (os.getFamily() != OS.Family.darwin)
			throw new IllegalArgumentException("Frameworks can only be built for Darwin platforms");

		if (paramConfig.getInfoPList() == null)
			throw new IllegalArgumentException("Frameworks must have a Info.plist file");
		paramConfig.getIosInfoPList().parse(paramConfig.getProperties());

		String sdkVersion = config.getIosSdkVersion();

		List<SDK> sdks = getSDKs();
        if (sdkVersion == null) {
            if (sdks.isEmpty()) {
                throw new IllegalArgumentException("No " + (isDeviceArch(arch) ? "device" : "simulator")
                        + " SDKs installed");
            }
            Collections.sort(sdks);
            this.sdk = sdks.get(sdks.size() - 1);
        }
        else {
            for (SDK sdk : sdks) {
                if (sdk.getVersion().equals(sdkVersion)) {
                    this.sdk = sdk;
                    break;
                }
            }
            if (sdk == null) {
                throw new IllegalArgumentException("No SDK found matching version string " + sdkVersion);
            }
        }

		if (!xcframework) {
			// regular framework
			// if building for fat binary -- check if it fits (e.g. if there is no arch and os conflict)
			Set<CpuArch> duplicateCpuArches = config.getArchs().stream()
					.collect(Collectors.groupingBy(Arch::getCpuArch, Collectors.counting()))
					.entrySet()
					.stream().filter(e -> e.getValue() > 1)
					.map(Map.Entry::getKey)
					.collect(Collectors.toSet());
			if (!duplicateCpuArches.isEmpty()) {
				List<Arch> duplicateArches = config.getArchs().stream()
						.filter(a -> duplicateCpuArches.contains(a.getCpuArch()))
						.sorted()
						.collect(Collectors.toList());
				throw new IllegalArgumentException("Wrong configuration: unable to create fat framework due duplicate CPU architectures: " +
						duplicateArches.stream().map(Arch::toString).collect(Collectors.joining(", ")) +
						". Use xcframework instead.");
			}
		}
	}

	@Override
	public String getInstallRelativeArchivePath(Path path) {
		return config.getImageName() + ".bundle/Resources/" + super.getInstallRelativeArchivePath(path);
	}

	@Override
	protected List<String> getTargetExportedSymbols() {
		return Arrays.asList("JNI_*", "rvmInstantiateFramework", "rvmInitializeFrameworkWithJVM", "OBJC_CLASS_$_*");
	}

	private String getMinimumOSVersion() {
		String minimumOSVersion = config.getInfoPList().getMinimumOSVersion();
		if (minimumOSVersion != null)
			return minimumOSVersion;
		return config.getOs().getMinVersion();
	}

	@Override
	protected List<String> getTargetCcArgs() {
		List<String> ccArgs = new ArrayList<String>();

		ccArgs.add("-stdlib=libc++");

		ccArgs.add("--target=" + config.getClangTriple(getMinimumOSVersion()));

		if (isDeviceArch(arch) && config.isEnableBitcode()) {
			// tells clang to keep bitcode while linking
			ccArgs.add("-fembed-bitcode");
		}

		ccArgs.add("-isysroot");
		ccArgs.add(sdk.getRoot().getAbsolutePath());

		ccArgs.add("-dynamiclib");
		ccArgs.add("-single_module");
		ccArgs.add("-compatibility_version");
		ccArgs.add("1");
		ccArgs.add("-current_version");
		ccArgs.add("1");

		ccArgs.add("-install_name");
		ccArgs.add(String.format("@rpath/%s.framework/%s", config.getImageName(), config.getImageName()));

		return ccArgs;
	}

	@Override
	protected List<String> getTargetLibs() {
    	// adding framework support library
		String libSuffix = config.isUseDebugLibs() ? "-dbg" : "";
		return Collections.singletonList("-lrobovm-frameworksupport" + libSuffix);
	}


	/**
	 * Array of arches per one binary. Each entry contains arches that can be
	 * combined by lipo into single binary.
	 * Currently, these are separated with by Environment only, e.g.
	 * [
	 *     [x86_64, x86, arm64-simulator],   // simulator arches
	 *     [arm64, thumbv7]                  // native arches
	 * ]
	 */
	private Arch[][] xcFrameworkArches;

	private Arch[][] getXCFrameworkArches() {
		if (xcFrameworkArches == null) {
			List<Arch> configArches = config.getArchs();
			if (configArches.size() == 1) {
				xcFrameworkArches = new Arch[][]{{configArches.get(0)}};
			} else {
				xcFrameworkArches = configArches.stream()
						.collect(Collectors.groupingBy(Arch::getEnv, Collectors.toList()))
						.values().stream()
						.map(arches -> arches.stream().sorted().toArray(Arch[]::new))
						.toArray(Arch[][]::new);
			}
		}
		return xcFrameworkArches;
	}

	@Override
	public void buildFat(Map<Arch, File> slices) throws IOException {
		// lipo is not able to combine different platform variants of same CpuArch. E.g. macos-arm64, ios-arm64 and
		// ios-arm64-simulator can't be combined into single binary.
		// in this case we have to produce multiple fat binaries and create XCFramework

		if (xcframework) {
            // if building for xcframework -- just split by os and environment and build each library
			Arch[][] archesInBinaries = getXCFrameworkArches();
			Map<Arch, File> slicesToConsume = new HashMap<>(slices);

			for (Arch[] archesInBinary: archesInBinaries) {
				List<File> filesForLipo = new ArrayList<>(archesInBinary.length);
				for (Arch arch: archesInBinary) {
					File f = slicesToConsume.remove(arch);
					if (f == null)
						throw new IllegalStateException("Required arch " + arch + " is missing in slices!");
					filesForLipo.add(f);
				}

				if (archesInBinary.length == 1) {
					// single file, copy to expected location
					File f = filesForLipo.get(0);
					String archDir = archesInBinary[0].toString();
					File destDir = new File(config.getTmpDir(), archDir);
					destDir.mkdirs();
					File destFile = new File(destDir, getExecutable());
					if (!f.equals(destFile)) {
						FileUtils.copyFile(f, destFile);
						destFile.setExecutable(true, false);
					}
				} else {
					// build fat
					String archDir = Arrays.stream(archesInBinary)
							.map(Arch::getCpuArch)
							.map(CpuArch::getClangName)
							.collect(Collectors.joining("_"));
					archDir = archDir + archesInBinary[0].getEnv().asLlvmSuffix("-");
					config.getLogger().info("Building fat binary for archs " + archDir);

					File destDir = new File(config.getTmpDir(), archDir);
					destDir.mkdirs();
					File destFile = new File(destDir, getExecutable());
					ToolchainUtil.lipo(config, destFile, filesForLipo);
				}
			}
		} else {
            // build fat binary
            super.buildFat(slices);
		}
	}

	@Override
	protected void doInstall(File installDir, String image, File resourcesDir) throws IOException {
		if (xcframework) {
			File xcFrameworkDir = new File(installDir, image + ".xcframework");
			if (xcFrameworkDir.exists())
				FileUtils.deleteDirectory(xcFrameworkDir);
			xcFrameworkDir.mkdirs();

			XCFrameworkPlist.Builder builder = new XCFrameworkPlist.Builder();

			config.getLogger().info("Creating framework: %s", xcFrameworkDir);
			// writing multiple framework copies maintaining xcframework directory structure
			Arch[][] archesInBinaries = getXCFrameworkArches();
			for (Arch[] archesInBinary : archesInBinaries) {
				String identifier;
				if (archesInBinary.length == 1) {
					identifier = archesInBinary[0].toString();
				} else {
					// build fat
					identifier = Arrays.stream(archesInBinary)
							.map(Arch::getCpuArch)
							.map(CpuArch::getClangName)
							.collect(Collectors.joining("_"));
					identifier = identifier + archesInBinary[0].getEnv().asLlvmSuffix("-");
				}
				File frameworkArchDir = new File(xcFrameworkDir, identifier);
				File frameworkDir = new File(frameworkArchDir, image + ".framework");
				File dsymDir = new File(frameworkArchDir, "dSYMs/" + image + ".dSYM");;
				File executable;
				if (config.getArchs().size() == 1) {
					// single arch framework. it was build without invoking buildFat() so binary is not copied
					// to arch-specific location and to be picked from build tmp folder
					executable = new File(config.getTmpDir(), getExecutable());
				} else {
					executable = new File(new File(config.getTmpDir(), identifier), getExecutable());
				}
				config.getLogger().info("Installing " + identifier + "framework slice: %s", frameworkDir);
				installFramework(frameworkDir, dsymDir, executable, image);

				XCFrameworkPlist.Library library = new XCFrameworkPlist.Library(identifier,
						image + ".framework", config.getOs(),
						Arrays.stream(archesInBinary).map(Arch::getCpuArch).toArray(CpuArch[]::new),
						archesInBinary[0].getEnv(), "dSYMs");
				builder.addLibrary(library);
			}

			XCFrameworkPlist plist = builder.build();
			File infoPlist = new File(xcFrameworkDir, "Info.plist");
			config.getLogger().info("Installing XCFramework/Info.plist to: %s", infoPlist);
			plist.writeTo(infoPlist);
		} else {
			// classic framework
			File executable = new File(config.getTmpDir(), getExecutable());
			File frameworkDir = new File(installDir, image + ".framework");
			File dsymDir = new File(installDir, image + ".dSYM");
			config.getLogger().info("Creating framework: %s", frameworkDir);
			installFramework(frameworkDir, dsymDir, executable, image);
		}
	}

	private void installFramework(File frameworkDir, File dsymDir, File binary, String image) throws IOException {
		if (frameworkDir.exists())
			FileUtils.deleteDirectory(frameworkDir);
		frameworkDir.mkdirs();

		// copy executable if required
		File executable = new File(frameworkDir, image);
		if (!binary.equals(executable)) {
			FileUtils.copyFile(binary, executable);
			executable.setExecutable(true, false);
		}

		File bundleDir = new File(frameworkDir, image + ".bundle");
		bundleDir.mkdirs();

		File bundleResourcesDir = new File(bundleDir, "Resources");
		bundleResourcesDir.mkdirs();

		super.doInstall(frameworkDir, executable, bundleResourcesDir);

		config.getLogger().info("Creating framework symbol directory: %s", dsymDir);
		if (dsymDir.exists())
			FileUtils.deleteDirectory(dsymDir);
		dsymDir.mkdirs();
		ToolchainUtil.generateDsym(config, dsymDir, executable);

		if (!config.isDebug()) {
			config.getLogger().info("Striping framework binary: %s", executable);
			new Executor(config.getLogger(), "xcrun").args("strip", "-x", executable).exec();
		}
		// remove bitcode to minimize binary size if not required
		if (!config.isEnableBitcode()) {
			config.getLogger().info("Striping bitcode from binary: %s", executable);
			stripBitcode(executable);
		}

		NSDictionary infoPlist = config.getInfoPList().getDictionary();
		if (infoPlist.objectForKey("MinimumOSVersion") == null)
			infoPlist.put("MinimumOSVersion", config.getOs().getMinVersion());

		File infoPlistBin = new File(frameworkDir, "Info.plist");
		config.getLogger().info("Installing Info.plist to: %s", infoPlistBin);
		PropertyListParser.saveAsBinary(infoPlist, infoPlistBin);
	}
}
