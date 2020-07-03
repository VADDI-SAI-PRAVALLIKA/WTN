package com.wipro.strings;
import java.util.*;

public class ex4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String b="";
	int len=s.length();
	if(len%2==0)
	{
		b=s.substring(0,len/2);
	}
	else
		b=null;
	System.out.println(b);
}
}
