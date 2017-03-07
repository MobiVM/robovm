package org.robovm.compiler.plugin.debug;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.debug.dwarf.DIBaseItem;
import org.robovm.compiler.llvm.debug.dwarf.DICompileUnit;
import org.robovm.compiler.llvm.debug.dwarf.DICompositeType;
import org.robovm.compiler.llvm.debug.dwarf.DIFileDescriptor;
import org.robovm.compiler.llvm.debug.dwarf.DILineNumber;
import org.robovm.compiler.llvm.debug.dwarf.DIMutableItemList;
import org.robovm.compiler.llvm.debug.dwarf.DIItemList;
import org.robovm.compiler.llvm.debug.dwarf.DISubprogram;
import org.robovm.compiler.llvm.debug.dwarf.DwarfConst;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import soot.SootMethod;
import soot.Unit;
import soot.tagkit.LineNumberTag;
import soot.tagkit.SourceFileTag;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * provides only line number debug information for now
 */
public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private ClassDataBundle classBundle;

    public DebugInformationPlugin() {
	}

    public PluginArguments getArguments() {
    	return new PluginArguments("debug", Collections.<PluginArgument>emptyList());
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder mb) throws IOException {
    	super.beforeClass(config, clazz, mb);

    	// keep all data for class in one structure, allows to reset thing by placing null there
        classBundle = new ClassDataBundle();
        classBundle.diFile = new DIItemList(mb, v("/"), v(getSourceFile(clazz)));
        classBundle.diFileDescriptor = new DIFileDescriptor(mb, classBundle.diFile);
        classBundle.diMethods = new DIMutableItemList<>(mb);
        classBundle.diCompileUnit = new DICompileUnit(mb, "llvm.dbg.cu", classBundle.diFile, classBundle.diMethods);
        DIItemList dwarfVersion =  new DIItemList(v(2), v("Dwarf Version"), v(2));
        DIItemList debugInfoVersion = new DIItemList(v(2), v("Debug Info Version"), v(2));
        classBundle.flags = new DIItemList(mb, "llvm.module.flags", dwarfVersion.get(), debugInfoVersion.get());
    }

    @Override
    public void afterClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
        super.afterClass(config, clazz, moduleBuilder);

        // cleanup
        classBundle = null;
    }

    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder mb, Function function) throws IOException {
        super.afterMethod(config, clazz, method, mb, function);

        // don't try to generate shadow frames for native or abstract methods
        // or methods that don't have any instructions in them
        if (method.isNative() || method.isAbstract() || !method.hasActiveBody()) {
            return;
        }

        BasicBlock entryBlock = function.getBasicBlocks().get(0);

        //Method has only a return null statement
        if (entryBlock.getInstructions().size() == 1) {
            return;
        }

        // fill subroutine type
        DICompositeType diSubprogramType = new DICompositeType(mb);
        diSubprogramType.setTypeTag(DwarfConst.Tag.TAG_subroutine_type);
        diSubprogramType.setFile(classBundle.diFile);
        diSubprogramType.setFileContext(classBundle.diFileDescriptor);
        // skip other fields for now as not required for line numbers

        DISubprogram diSubprogram = new DISubprogram(mb);
        diSubprogram.setSubrotineType(diSubprogramType);
        diSubprogram.setSignature(function.getName());
        diSubprogram.setFile(classBundle.diFile);
        diSubprogram.setFileContext(classBundle.diFileDescriptor);
        diSubprogram.setLlvmFunction(function.ref());


        // find line numbers
        int methodLineNumber = Integer.MAX_VALUE;
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction instruction = bb.getInstructions().get(i);
                List<Object> units = instruction.getAttachments();
                int currentLineNumber;
                for (Object object : units) {
                    if (!(object instanceof Unit))
                        continue;
                    Unit unit = (Unit) object;
                    LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                    if (tag == null)
                        continue;

                    currentLineNumber = tag.getLineNumber();
                    methodLineNumber = Math.min(methodLineNumber, currentLineNumber);
                    instruction.addMetadata((new DILineNumber(currentLineNumber, 0, diSubprogram)).get());
                }
            }
        }

        diSubprogram.setScopeLineNo(methodLineNumber);
        diSubprogram.setDefLineNo(methodLineNumber);
        classBundle.diMethods.add(diSubprogram);
    }


    /** Simple file name resolved, for LineNumbers there is no need in absolute file location, just in name */
    private String getSourceFile(Clazz clazz) {
    	String sourceFile;
    	SourceFileTag sourceFileTag = (SourceFileTag) clazz.getSootClass().getTag("SourceFileTag");
    	if (sourceFileTag != null) {
    	    sourceFile = sourceFileTag.getSourceFile();
    	} else {
            String className = clazz.getInternalName();
            sourceFile = className.substring(clazz.getInternalName().lastIndexOf("/") + 1) + ".java";
    	}

    	return sourceFile;
	}


    /**
     * data bundle that contains debug information for class
     */
	private static class ClassDataBundle {
        DIBaseItem diFile;
        DIBaseItem diFileDescriptor;
        DIMutableItemList<DISubprogram> diMethods;
        DIBaseItem diCompileUnit;
        DIBaseItem flags;
    }

	private IntegerConstant v(int i) {
    	return new IntegerConstant(i);
	}

	private MetadataString v(String s) {
    	return new MetadataString(s);
	}
}
