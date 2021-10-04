package com.lockedme;

import java.util.Scanner;

public class Application {
	public void run()
	{
		Scanner sc= new Scanner(System.in);
		int choice;
		do
		{
			MainMenu m = new MainMenu();
			m.options();
			choice = sc.nextInt();
			FileOperations fop = new FileOperations();
			fop.operations(choice);	
		}
		while(choice!=3);
	}
	public static void main(String[] args) {
		System.out.printf("%-15s%-30s%s\n","**********","Welcome to Lockedme.com","**********");
		System.out.printf("%-15s%-30s%s\n","**********","Version: 1.0.0","**********");
		System.out.printf("%-15s%-30s%s\n","**********","Developer: Aniket Gaikwad","**********");
		System.out.println();
		Application app = new Application();
		app.run();
	    
	}
}

