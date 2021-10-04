package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperations {
	public void businessOperations()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a operation to be performed...");
		System.out.println("1. Addd a file");
		System.out.println("2. Delete file");
		System.out.println("3. Search a file");
		System.out.println("4. Return to the main menu");
		System.out.println("Input you choice..");
		int operation = sc.nextInt();
		switch(operation)
		{
		case 1:
		AddFiles ad = new AddFiles();
		ad.addFiles1();
		break;
		case 2:
		DeleteFiles df =new DeleteFiles();
		try
		{
		df.deleteFiles1();
		}
		catch(InvalidFileNameException e)
		{
			System.out.println(e.getMessage());
		}
		break;
		case 3:
		SearchFiles sf = new SearchFiles();
		sf.searchFiles1();
		break;
		case 4:
		MainMenu m = new MainMenu();
		m.options();
		Application ap = new Application();
		ap.run();
		break;
		default:
		System.out.println("Invalid Choice!!");
		break;
			
		}

	}
}
