package com.foo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEmulator {

	public void createANewDirectory(String path) {
		// create a directory
		File file = new File(path);
		file.mkdir();

	}

	public void createANewFile(String path) {

		File obj = new File(path);
		try {
			obj.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) {

		new FileEmulator().createANewDirectory("C:\\Software\\folder" + new Date().getTime());
		new FileEmulator().createANewFile("C:\\Software\\folder\\logfiles" + new Date().getTime());
	}

}
