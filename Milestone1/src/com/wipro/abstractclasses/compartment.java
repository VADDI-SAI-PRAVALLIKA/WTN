package com.wipro.abstractclasses;

abstract public class compartment
{
abstract void notice();
}
class FirstClass extends compartment
{
	void notice()
	{
		System.out.println("notice() from first class");
	}
	
}
class Ladies extends compartment
{
	void notice()
	{
		System.out.println("notice() from Ladies");
	}
}
class General extends compartment
{
	void notice()
	{
		System.out.println("notice() from General");
	}
	
}
class Luggage extends compartment
{
	void notice()
	{
		System.out.println("notice() from luggage");
	}
	
}
