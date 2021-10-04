package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchFiles {
	final static Scanner sc =new Scanner(System.in);
	public void searchFiles1()
	{
		File file = new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Lockedme.com\\\\Files");
		File[] allFiles = file.listFiles();
		System.out.println("Enter the name of the file to be searched..");
		String fileName = sc.next();
		if(allFiles.length<1)
		{
			System.out.println("There are no files in the directory");
			return;
		}
		for(File files:allFiles)
		{
			if(files.getName().equals(fileName))
			{
				try {
					System.out.println("File found at location: "+files.getCanonicalPath());
					return;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("File "+fileName+" not found in the directory");
		
		
	}

	

}
