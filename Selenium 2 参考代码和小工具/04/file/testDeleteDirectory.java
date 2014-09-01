package com.learningselenium.file;

import java.io.File;

import org.openqa.selenium.io.FileHandler;

public class testDeleteDirectory {
	public static void main(String... args) {
			FileHandler.delete(new File("/new_created_directory"));
	}
}
