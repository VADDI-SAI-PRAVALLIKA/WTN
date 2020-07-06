package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;

import com.wipro.task.Dailytasks;

import org.junit.Test;

public class TestSort {
	Dailytasks d=new Dailytasks();
	
	@Test
	public void test()
	{
		int []a=new int[] {1,3,7,2};
		int []b=new int[] {1,2,3,7};
		assertArrayEquals(b,d.sortValues(a));
	}

}
