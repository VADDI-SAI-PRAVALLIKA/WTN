package com.wipro.flowcontrol;

public class ex17 {
	public static void main(String[] args)
	{
		 int n=Integer.parseInt(args[0]);
		 int i,temp,r,sum=0;
		 temp=n;
		 while(n>0)
		 {
			 r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
		 if(temp==sum)
		 {
			 System.out.println(temp+" is a palindrome");
		 }
		 else
		 {
			 System.out.println(temp+" is not a palindrome");
		 }
	}

}
