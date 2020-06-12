package com.wipro.flowcontrol;

public class ex13 {
	public static void main(String[] args)
	{
		int temp;
		int i;
		for(i=11;i<99;i++)
		{
			temp=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					temp++;
					break;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
