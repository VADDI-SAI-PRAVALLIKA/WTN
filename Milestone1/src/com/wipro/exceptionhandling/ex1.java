package com.wipro.exceptionhandling;
import java.util.*;
public class ex1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,posistion;
		System.out.println("Enter the number of elements in array");
		try
		{
		n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=Integer.parseInt(sc.next());
		}
		System.out.println("Enter the index element where you want to access");
		posistion=sc.nextInt();
		System.out.println("THe array element at index "+posistion+" = "+array[posistion]);
		System.out.println("The array element successfully accessed");
		}
		catch(NumberFormatException object)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException object)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}
	

}