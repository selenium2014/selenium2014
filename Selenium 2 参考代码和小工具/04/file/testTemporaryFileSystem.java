package com.learningselenium.file;

import java.io.File;

import org.openqa.selenium.io.TemporaryFilesystem;

public class testTemporaryFileSystem {
	public static void main(String... args) {
		File tempDirectory = TemporaryFilesystem.
						getDefaultTmpFS().
						createTempDir("prefix", "suffix");
		System.out.println(tempDirectory.getAbsolutePath());
		System.out.println("Free Space of Temporary Directory is:" 
							+ tempDirectory.getFreeSpace());
	}
}
