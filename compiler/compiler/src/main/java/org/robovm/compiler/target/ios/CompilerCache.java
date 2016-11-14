package org.robovm.compiler.target.ios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Resource;
import org.robovm.compiler.config.Resource.Walker;

public class CompilerCache implements Cloneable{
	private final static String JSON_CACHE_FILE = "compiler_cache.json";
	private File jsonCacheFile;
	private File projectRoot;
	private Config config;
	private boolean currentResourceChanged = false;
	private boolean resourceChanged = false;
	private int compiledClasses = 0;

	private JSONObject resourceTimestamps;
	
	public CompilerCache(Config config) {
		this.config = config;
	}
	
	public void readCache() {
		if (this.getJsonCacheFile().exists() && this.getJsonCacheFile().length() > 0) {
			JSONParser parser = new JSONParser();
			try {
				this.resourceTimestamps = (JSONObject) parser.parse(new FileReader(this.jsonCacheFile));
			} catch (FileNotFoundException e) {
				config.getLogger().warn("Error when reading JSON compiler cache file %s.", this.jsonCacheFile);
			} catch (IOException e) {
				config.getLogger().warn("Error when reading JSON compiler cache file %s.", this.jsonCacheFile);
			} catch (ParseException e) {
				config.getLogger().warn("Error when reading JSON compiler cache file %s.", this.jsonCacheFile);
			}
		}
	}
	
	public void writeCache() {
		this.getJsonCacheFile().delete();
		FileWriter fw;
		try {
			fw = new FileWriter(this.getJsonCacheFile());
			this.getResourceTimestamps().writeJSONString(fw);
			fw.close();

		} catch (IOException e) {
			config.getLogger().warn("Error when writing JSON compiler cache file %s.", this.jsonCacheFile);
		}	
	}
	
	public void deleteCache() {
		this.getJsonCacheFile().delete();
	}
	
	public File getJsonCacheFile() {
		if (this.jsonCacheFile == null) {
			this.jsonCacheFile = new File(config.getCacheDir() + projectRoot.getAbsolutePath() + "/" + JSON_CACHE_FILE);
		}
		return this.jsonCacheFile;
	}
	
	public JSONObject getResourceTimestamps() {
		if (this.resourceTimestamps == null) {
			this.resourceTimestamps = new JSONObject(); 
		}
		return this.resourceTimestamps;
	}
	
	public void addRobovmXmlTimestamp() {
		addTimestamp(new File(projectRoot, "robovm.xml"));
	}
	
	public void addTimestamp(File file) {
		if (file.exists()) {
			getResourceTimestamps().put(file.getAbsolutePath(), file.lastModified());
		}
	}
	
	public void addTimestamp(String path) {
		if (path != null) {
			addTimestamp(new File(path));
		}
	}
	
	public void addTimestamp(Resource res) {
		try {
			res.walk(new Walker() {
			    @Override
			    public boolean processDir(Resource resource, File dir, File destDir) throws IOException {
			    	return true;
			    }
			    @Override
			    public void processFile(Resource resource, File file, File destDir)
			            throws IOException {
			    	addTimestamp(file);
			    }
			}, config.getTmpDir());
		} catch (IOException e) {
			config.getLogger().warn("Something went wrong when trying to update changed status of resource %s.", res.getPath().getAbsolutePath());
		}	
	}
	
	public boolean isResourceChanged(Resource res) {
		currentResourceChanged = false;
		try {
			res.walk(new Walker() {
			    @Override
			    public boolean processDir(Resource resource, File dir, File destDir) throws IOException {
			    	return !currentResourceChanged;
			    }
			    @Override
			    public void processFile(Resource resource, File file, File destDir)
			            throws IOException {
			    	if (!currentResourceChanged) {
			    		currentResourceChanged = isResourceChanged(file);
			    	}
			    }
			}, config.getTmpDir());
		} catch (IOException e) {
			config.getLogger().warn("Something went wrong when trying to find out changed status of resource %s.", res.getPath().getAbsolutePath());
			return true;
		}
		
		if (currentResourceChanged) {
			resourceChanged = true;
		}
		
		return currentResourceChanged;
    }
	
	public boolean isResourceChanged(String resource) {
		return isResourceChanged(new File(resource));
	}
	
	public boolean isResourceChanged(File resource) {
		if (getResourceTimestamps().containsKey(resource.getAbsolutePath())) {
			long oldTimestamp = (long) getResourceTimestamps().get(resource.getAbsolutePath());
			return resource.lastModified() > oldTimestamp;
		}
		return true;
	}
	
	public boolean isRobovmXmlChanged() {
		return isResourceChanged(new File(this.projectRoot, "robovm.xml"));
	}
	
	public void setProjectRoot(File projectRoot) {
		this.projectRoot = projectRoot;
	}
	
	public int getCompiledClasses() {
		return compiledClasses;
	}

	public void setCompiledClasses(int compiledClasses) {
		this.compiledClasses = compiledClasses;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		CompilerCache clone = new CompilerCache(this.config);
		return clone;
	}

	public boolean isAnyResourceChanged() {
		return true;
	}

}
