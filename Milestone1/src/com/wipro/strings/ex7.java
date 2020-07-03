package com.wipro.strings;
import java.util.*;
class xx
{
	String method(String s1)
	{
		if(s1.charAt(0)=='x' && s1.charAt(s1.length()-1)=='x')
		{
			return(s1.substring(1,s1.length()-1));
		}
		else
			return(s1);
	}
}
public class ex7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	xx t=new xx();
	System.out.println(t.method(s1));
		
}
}