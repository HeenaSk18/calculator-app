package com.demo;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class Demo4 {

	public static void main(String[] args) {

		File myFile = new File("NewDemo.txt");

		String absolutePath = myFile.getAbsolutePath();
		System.out.println(absolutePath);
		String extensionFile = FilenameUtils.getExtension(absolutePath);
		System.out.println(extensionFile);

		String fileName = FilenameUtils.getName(absolutePath);
		System.out.println(fileName);
		
		String path=FilenameUtils.getFullPath(absolutePath);
		System.out.println(path);
	}
}
