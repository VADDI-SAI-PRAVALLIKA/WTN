package com.wipro.flowcontrol;

public class ex16 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int i,sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
