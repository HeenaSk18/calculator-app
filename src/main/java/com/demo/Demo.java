package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Demo {

	public static void main(String[] args) {
		File myFile =new File("demo.txt");
		try {
			FileUtils.writeStringToFile(myFile, "Hi my name is Heena\n", StandardCharsets.UTF_8);
			FileUtils.writeStringToFile(myFile, "Hi my name is Heena\n", StandardCharsets.UTF_8,true);
			FileUtils.writeStringToFile(myFile, "Hi my name is Heena\n", StandardCharsets.UTF_8,true);
			FileUtils.writeStringToFile(myFile, "Hi my name is Heena\n", StandardCharsets.UTF_8,true);
			FileUtils.writeStringToFile(myFile, "Hi my name is Heena\n", StandardCharsets.UTF_8,true);

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Writing Multiple Lines in One Go!!
		List<String> lines = Arrays.asList("Heena","Altaf","Rukhsana");
		try {
			FileUtils.writeLines(myFile,lines, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Reading from a file
		String data;
		try {
			data=FileUtils.readFileToString(myFile, StandardCharsets.UTF_8);
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Reading from file and storing it in a list
		List<String> dataLines=null;
		try {
			dataLines=FileUtils.readLines(myFile, StandardCharsets.UTF_8);
			System.out.println(dataLines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dataLines.get(7));
		
	}

}
