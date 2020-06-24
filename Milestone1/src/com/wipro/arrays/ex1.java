package com.wipro.arrays;

public class ex1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		float avg=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		avg=(float)sum/a.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}
	
}
