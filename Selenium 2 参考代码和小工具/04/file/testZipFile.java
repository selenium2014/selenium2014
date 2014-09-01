package com.learningselenium.file;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.Zip;

public class testZipFile {
	public static void main(String... args) {
		Zip zip = new Zip();
		try {
				zip.zip(new File("/directory_to_zip"),
						new File("/final_directory/zipped_file.zip"));
				
				System.out.println(
						FileHandler.isZipped("/final_directory/zipped_file.zip"));
				
				zip.unzip(new File("/final_directory/zipped_file.zip"), 
						  new File("/final_unzipped_directory"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
