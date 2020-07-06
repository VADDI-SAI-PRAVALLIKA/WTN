package com.wipro.javaio;
import java.util.*;
import java.io.*;

public class ex1 {
public static void main(String[] args) throws IOException {
	String filename;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the file name");
	filename=s.next();
	System.out.println("Enter the character to be counted");
	FileReader fr = null;
	String letter=s.next();
	try {
		int c=0;
		fr=new FileReader("C:\\Users\\sai_s\\git\\WTN\\Milestone1\\src\\com\\wipro\\javaio\\"+filename);
		int ch;
		while((ch=fr.read())!=-1)
		{
			if(letter.equalsIgnoreCase(((char)ch)+""))
				c++;
		}
		System.out.println(String.format("File '%s' has %d instances of letter '%s'",filename,c,letter));
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		fr.close();
	}
}
}
