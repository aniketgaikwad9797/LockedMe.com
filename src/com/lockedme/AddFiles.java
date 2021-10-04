package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFiles {
	public void addFiles1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file to be added");
		String filename = sc.next();
		String filePath = "C:\\Users\\Dell\\eclipse-workspace\\Lockedme.com\\Files\\"+filename;
		File addFile = new File(filePath); //initialize File object and passing path as argument  
		boolean result;  
		try   
		{  
		result = addFile.createNewFile();  //creates a new file  
		if(result)      
		{  
		System.out.println("File created "+addFile.getCanonicalPath()); //returns the path string  
		}  
		else  
		{  
		System.out.println("File already exists at location: "+addFile.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();    
		}   
	}

	
}
