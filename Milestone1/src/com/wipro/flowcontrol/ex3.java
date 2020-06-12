package com.wipro.flowcontrol;

public class ex3 {
	public static void main(String[] args)
	{
		if(args.length>0)
		{
			for(int i=1;i<args.length;i++)
			{
				System.out.println(args[0]+","+args[i]);
			}
		}
		else
		{
			System.out.println("No values");
		}
	}

}
