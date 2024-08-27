package com.gentech.assignment.inheritance;
class Company1{
	String companyname="H&M";

	Company1(String Joiningdate, int salary)
	{
		System.out.println("Company name: "+ companyname+ " Joining date :"+Joiningdate+" Salary :"+salary);
	}
	Company1(String Joiningdate, int salary,String leavingdate)
	{
		System.out.println("Company name: "+ companyname+ " Joining date :"+Joiningdate+" Salary :"+salary+"Leaving date "+leavingdate);
	}
	Company1()
	{

		System.out.println("COMPANY NAME: "+companyname+" DEFAULT");
	}
}
class Employee extends Company1{
	String ename;
	Employee(String Joiningdate, int salary)
	{
		super(Joiningdate,salary);
	}
	Employee(String Joiningdate, int salary,String leavingdate)
	{
		super(Joiningdate,salary,leavingdate);
	}
	Employee()
	{
		ename= "divya";
		System.out.println("Employee name "+ename+" DEFAULT");
	}
}
class Recruited1 extends Employee{
	String recname;
	Recruited1()
	{
		recname="Shashi";
		System.out.println("Recruited employee name :"+recname+" DEFAULT");
	}
	Recruited1(String Joiningdate, int salary)
	{
		super(Joiningdate,salary);
	}
	Recruited1(String Joiningdate, int salary,String leavingdate)
	{
		super(Joiningdate,salary,leavingdate);
	}
}

public class MultiLevelConstructorOverloading {
	public static void main(String[] args) {
		Recruited1 r = new Recruited1();
		Recruited1 r3=new Recruited1("15/6/2028",850000);
		Recruited1 r2 = new Recruited1("15/02/2023", 90000, "8/02/2026");

	}

}

