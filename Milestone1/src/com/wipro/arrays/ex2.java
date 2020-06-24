package com.wipro.arrays;

public class ex2 {
	public static void main(String[] args) {
		int a[]= {2,4,1,5,8,9};
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
