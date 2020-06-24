package com.wipro.classes_objects;

public class box {
	double width,height,depth;
	box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;	
	}
	double volume()
	{
		return width*height*depth;
	}
	public static void main(String[] args)
	{
		box b= new box(1,2,3);
		System.out.println(b.volume());
		
	}

}
