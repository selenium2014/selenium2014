package com.learningselenium.file;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class testFilePermission {
	public static void main(String... args) {
		if(!FileHandler.canExecute(new File("/directory/file1.sh"))) {
			try {
				FileHandler.makeExecutable(new File("/directory/file1.sh"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileHandler.makeWritable(new File("/directory/file2.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
