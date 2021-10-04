package com.lockedme;

import java.io.File;
import java.util.Scanner;
class InvalidFileNameException extends Exception
{

	private static final long serialVersionUID = 1L;

	public InvalidFileNameException(String errorMessage)
	{
		super(errorMessage);
	}
}
public class DeleteFiles {
	public void deleteFiles1() throws InvalidFileNameException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file to be deleted");
		String filename1 = sc.next();
		String filePath1 = "C:\\Users\\Dell\\eclipse-workspace\\Lockedme.com\\Files\\"+filename1;
		File deleteFile = new File(filePath1);
			if(!deleteFile.isDirectory())
			throw new InvalidFileNameException(filename1+" does not exist in the directory!");
			else if(deleteFile.delete())
	        {
	            System.out.println("File deleted successfully");
	        }
	        else
	        {
	            System.out.println("File not Found");
	        }
			sc.close();
	}

	

}
