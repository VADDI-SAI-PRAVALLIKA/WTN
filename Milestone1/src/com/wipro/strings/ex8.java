package com.wipro.strings;
import java.util.*;

public class ex8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	int j=0;
	for(int i=0;i<s1.length()-1;i++)
	{
		if(i==0 && s1.charAt(0)=='*')
		{
			s1=s1.substring(2);
		}
		else
		{
			j=s1.indexOf('*');
			s1=s1.substring(0,j-2)+s1.substring(j+2);
		}
	}
	System.out.println(s1);
}
}
