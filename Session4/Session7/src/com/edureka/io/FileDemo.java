package com.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {

	public static void main(String[] args) {

		File f = new File("Test.txt");

		if (f.exists()) {
			System.out.println("FIle Exists");
		} else {
			System.out.println("File Doesnt exists");

			try {
				f.createNewFile(); // create file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());

		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		String str = "101,Asif,1000000";

		try {
			FileOutputStream fos = new FileOutputStream(f);

			fos.write(str.getBytes());

			fos.close();

			System.out.println("Writing Done");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(f);

			/*
			 * int i = 0; // ASCII
			 * 
			 * while ((i = fis.read()) != -1) { // i = -1 EOF
			 * 
			 * System.out.print((char) i);
			 * 
			 * }
			 */

			/*
			 * BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			 * 
			 * String str1 = br.readLine();
			 * 
			 * while (str1 != null) { System.out.println(str1); str1 = br.readLine(); }
			 */

			java.util.Scanner sc = new java.util.Scanner(f);

			sc.useDelimiter(",");
			
			String str3;
			
			Employee e = new Employee();
			
			while (sc.hasNext()) {
				str3 = sc.next();
				e.id = Integer.parseInt(str3);
				System.out.println(str3);
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
