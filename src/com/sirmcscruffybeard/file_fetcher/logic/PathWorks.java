package com.sirmcscruffybeard.file_fetcher.logic;

import java.io.File;

public class PathWorks {

	
	public String getCurrentPath() { return new File("").getAbsolutePath(); }
	
	public boolean currentPathExist() { return new File(this.getCurrentPath()).exists(); }
	
	public File[] getCurrentFiles() { return new File(this.getCurrentPath()).listFiles(); }
	
	public String[] getFileNames() {
		
		File[] files = this.getCurrentFiles();
		
		String[] names = new String[files.length];
		
		for (int i = 0; i < names.length; i++) names[i] = files[i].toString(); 
		
		return names;
	}
	
}