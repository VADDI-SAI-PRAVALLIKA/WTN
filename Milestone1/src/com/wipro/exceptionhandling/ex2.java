package com.wipro.exceptionhandling;

import java.util.*;

public class ex2{
	public static void main(String[] args) throws Exception {
		int n=args.length;
		int[] a=new int[n];
		int sum=0,avg;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println(sum);
		System.out.println(avg);
		
		
	}

}
