package com.learningselenium.file;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class testReadFile {
	public static void main(String... args) {
		try {
			String file = FileHandler.readAsString(new File("/directory/fileToRead.txt"));
			System.out.println(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
