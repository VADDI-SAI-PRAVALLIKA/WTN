package com.wipro.flowcontrol;

public class ex8 {
	public static void main(String[] args)
	{
		String a=args[0];
		char ch=a.charAt(0);
		switch(ch)
		{
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		}
	}

}
