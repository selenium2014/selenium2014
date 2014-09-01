package com.learningselenium.file;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class testCreateDirectory {
	public static void main(String... args) {
		try {
			FileHandler.createDir(new File("/new_created_directory"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
