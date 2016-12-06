package com.foo;

import java.io.File;


public class FileUtility {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	File file = new File("C:\\Software");
	
	System.out.println(file.getParent());
	System.out.println(file.isDirectory());
	System.out.println(file.isFile());
	System.out.println(file.isHidden());
	System.out.println(file.lastModified());
	
	String [] filename = file.list();
	// length = filename.length;
	for (int i=0; i<filename.length;i++){
		String name = filename[i];
		System.out.println(name);
		
	}
	
	//System.out.println(file.list());
		
	}

}
