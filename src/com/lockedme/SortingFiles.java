package com.lockedme;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class SortingFiles {
	public void sortingFiles()
	{
		File dir = new File("C:\\Users\\Dell\\eclipse-workspace\\Lockedme.com\\Files");
		sorted:
		{
		if(dir.isDirectory())
	    {
	      File[] files = dir.listFiles();
	      if(files.length==0)
	      {
	    	  System.out.println("No files found in the directory!");
	    	  System.out.println();
	    	  break sorted;
	      }
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });
	      System.out.println("\nRetreiving the files in sorted order...");
	      System.out.println("----------------------------------"); 
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("----------------------------------"); 
	      System.out.println();
	    }
		}
		
	}
}
