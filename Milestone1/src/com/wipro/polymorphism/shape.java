package com.wipro.polymorphism;

public class shape {
void draw()
{
	System.out.println("Drawing Shape");
}
void erase()
{
	System.out.println("Erasing Shape");
}
}

class Triangle extends shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Circle extends shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
	
}
class Square extends shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
