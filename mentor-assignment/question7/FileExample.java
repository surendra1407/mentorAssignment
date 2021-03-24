package com.example.question7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExample {

	public static void main(String[] args) {
		try {
		      File myfile = new File("filename.txt");
		      if (myfile.createNewFile()) {
		        System.out.println("File created: " + myfile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      List<String>al=new ArrayList<String>();
		      al.add("Hello");
		      al.add("Surendra");
		      FileWriter fw=new FileWriter("filename.txt");
		      
		      for(int i=0;i<al.size();i++)
		      {
		    	  fw.write(al.get(i));
		      }
		      System.out.println("Successfully data stored in file");
		     
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	}


