package com.learningselenium.file;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class testCopyFile {
	public static void main(String... args) {
		try {
			FileHandler.copy(new File("/source_directory"), 
					         new File("/destination_directory"));
			
			FileHandler.copy(new File("/source_directory/file.txt"), 
			                 new File("/destination_directory/file.txt"));
			
			FileHandler.copy(new File("/source_directory"), 
					         new File("/destination_directory"), 
					         "suffix.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
