package com.wipro.flowcontrol;

public class ex7 {
	public static void main(String[] args)
	{
		char a='a';
		if(a>=65&&a<=90)
		{
			System.out.println(a+"->"+Character.toLowerCase(a));
		}
		else if(a>=97 && a<=127)
		{
			System.out.println(a+"->"+Character.toUpperCase(a));
		}
	}

}
