package com.foo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderUtility {

	public int readfile(String filepath) throws Exception {
		int count = 0;
		File f = new File(filepath);
		FileReader fr1 = new FileReader(f);
		BufferedReader br = new BufferedReader(fr1);
		String str = "";
		while ((str = br.readLine()) != null) {

			System.out.println(str);
			count++;

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int numberofrows = new FileReaderUtility().readfile("C:\\training\\Data\\data.txt");
			System.out.println("There are" + numberofrows + "lines in the file");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
