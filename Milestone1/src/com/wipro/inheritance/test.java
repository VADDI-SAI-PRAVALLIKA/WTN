package com.wipro.inheritance;

public class test {
public static void main(String[] args) {
	person p=new person("mahitha");
	p.setName("mahi");
	p.getName();
	employee e=new employee(150000,2020,"poi123");
	System.out.println(e.getName());
	System.out.println(e.getAnnualsalary());
	System.out.println(e.getYear());
	e.getInsu_num();
	
}
}
