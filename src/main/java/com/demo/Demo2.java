package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		File myFile =new File("demo.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fileWriter;
		try {
			fileWriter =new FileWriter(myFile);
			fileWriter.write("This is a demo line");
			fileWriter.flush();//mandatory
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileReader fr;
		BufferedReader br;
		try {
			fr=new FileReader(myFile);
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
