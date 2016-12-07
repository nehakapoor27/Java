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
		// System.out.println(file.lastModified());

		String[] filename = file.list();
		// length = filename.length;
		for (int i = 0; i < filename.length; i++) {
			String name = filename[i];
			System.out.println(name);

		}

		File[] obj = file.listFiles();
		for (int i = 0; i < obj.length; i++) {

			File f = obj[i];
			System.out.println(f);
			String name = f.getName();
			System.out.println(name);

			boolean isDirectory = f.isDirectory();
			if (isDirectory) {

				System.out.println(name + "" + "Directory");

			}
			else {
				
				System.out.println(name + "" + "File");
			}
		}

	}

}
