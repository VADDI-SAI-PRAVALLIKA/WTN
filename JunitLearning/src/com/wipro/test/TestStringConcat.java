package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.Dailytasks;

public class TestStringConcat {
	Dailytasks d=new Dailytasks();
	
	@Test
	public void test() {
		assertEquals("vaddisai",d.doStringConcat("vaddi","sai"));
	}

}