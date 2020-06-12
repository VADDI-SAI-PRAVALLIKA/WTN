package com.wipro.flowcontrol;

public class ex5 {
	public static void main(String[] args)
	{
	
			char a='e';
			if((a>=65 && a<=90)||(a>=97 && a<=123))
			{
				System.out.println("Alphabet");
			}
			else if(a>=48 && a<=57)
			{
				System.out.println("Digit");
			}
			else
			{
				System.out.println("Special Character");
			}
		
	}

}
