package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Demo3 {

	public static void main(String[] args) {
	
		File myFile =new File("demo.txt");
		File destinationFile = new File("copy-demo.txt");
		
		try {
			FileUtils.copyFile(myFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
