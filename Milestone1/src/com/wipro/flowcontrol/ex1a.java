package com.wipro.flowcontrol;

public class ex1a {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Positive Number");
		}
		else if(a<0)
		{
			System.out.println("Negative NUmber");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
