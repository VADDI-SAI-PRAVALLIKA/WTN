package com.wipro.flowcontrol;

public class ex12 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime");
				break;
			}
			else
			{
				System.out.println("prime");
				break;
			}
		}
	}

}
