package com.lockedme;

import java.util.Scanner;

public class FileOperations {
	public void operations(int choice)
	{
		Scanner sc=new Scanner(System.in);
		//int choice  = sc.nextInt();
		switch(choice)
		{
		case 1:
			SortingFiles s = new SortingFiles();
			s.sortingFiles();
			break;
		case 2:
			BusinessOperations b = new BusinessOperations();
			b.businessOperations();
			break;
		case 3:
			System.out.println("You have successfully exited from the application. Do visit back!");
			System.exit(0);
		default:
		System.out.println("Invalid Choice!!!");
		}
	}
}
