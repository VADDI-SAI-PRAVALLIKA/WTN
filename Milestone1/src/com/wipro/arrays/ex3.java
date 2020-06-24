package com.wipro.arrays;

public class ex3 {
	public static void main(String[] args) {
		int a[]= {1,4,34,56,7};
		int count=0;
		int ele=Integer.parseInt(args[0]);
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				System.out.println(i);
				break;
			}
			count++;
			
		}
		if(count==a.length)
			System.out.println("-1");
	}

}
