package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import com.wipro.task.Dailytasks;

public class TestCheckPresence {
	Dailytasks d=new Dailytasks();
	@Test
	public void test1()
	{
		assertTrue(d.checkPresence("vaddisai", "sai"));
	}
	@Test
	public void test2()
	{
		assertFalse(d.checkPresence("vaddisai", "vadi"));
	}

}
