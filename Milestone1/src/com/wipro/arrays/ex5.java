package com.wipro.arrays;

public class ex5 {
	public static void main(String[] args) {
		int a[]= {2,9,67,1,6};
		int max1=a[0],max2=a[1];
		int min1=a[0],min2=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
				max1=a[i];
			else if(a[i]>max2&&a[i]!=max1)
			{
				max2=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min1)
				min1=a[i];
			else if(a[i]<min2&&a[i]!=min1)
				min2=a[i];
		}
		System.out.println(max1+" "+max2);
		System.out.println(min1+" "+min2);
	}

}
