package com.wipro.strings;
import java.util.*;

public class ex6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	int s=a.length();
	int p=b.length();
	String q="";
	if(s<p)
	{
		System.out.println(a+b+a);
	}
	else if(p<s)
	{
		System.out.println(b+a+b);
	}
	else if(p==s)
	{
		System.out.println("null");
	}
}
}
