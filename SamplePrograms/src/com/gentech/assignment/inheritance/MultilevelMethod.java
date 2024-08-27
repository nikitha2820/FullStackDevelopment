package com.gentech.assignment.inheritance;

class Counter1
{
	void displayAddress()
	{
		System.out.println("Address of counter 1 : Timmapur Circle");
	}
	int Employeecount(int sal)
	{
		int count = 5;
		System.out.println("Count of employee in Counter 1 :"+count);
		return count;
	}
}
class Counter2 extends Counter1
{

	void displayAddress()
	{
		super.displayAddress();
		System.out.println("Address of counter 2 : White Field 2nd Block");
	}
	int Employeecount(int sal )
	{
		int count = 10;
		System.out.println("Count of employee in Counter 2 :"+count);
		super.Employeecount(sal);
		return count;
	}
}
class Counter3 extends Counter2
{
	void displayAddress()
	{
		super.displayAddress();
		System.out.println("Address of Counter 3 : Kengeri ");
	}
	int Employeecount(int sal)
	{
		int count = 15;
		super.Employeecount(sal);
		System.out.println("Count of employee in counter 3 :"+count);
		return count;
	}
}
public class MultilevelMethod
{
	public static void main(String[] args)
	{
		Counter3 ob = new Counter3();
		ob.displayAddress();
		int count= ob.Employeecount(80000);
	}
}

