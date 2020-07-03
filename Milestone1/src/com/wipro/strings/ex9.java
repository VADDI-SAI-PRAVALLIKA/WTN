package com.wipro.strings;
import java.util.*;

public class ex9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	String d="";
	if(a.length()>b.length())
	{
	for(int i=0;i<b.length();i++)
	{
		d=d+a.charAt(i)+b.charAt(i);
	}
		d=d+a.substring(b.length());
	}
	else
	{
		for(int i=0;i<a.length();i++)
		{
			d=d+a.charAt(i)+b.charAt(i);
		}
			a=d+b.substring(a.length());
	}
	System.out.println(a);
}
}
