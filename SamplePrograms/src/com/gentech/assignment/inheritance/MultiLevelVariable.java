package com.gentech.assignment.inheritance;
class COLLEGE
{
	String collegname="Polytechnic";
}
class Teacher extends COLLEGE{
	String collegname = super.collegname;
	String teachername = "Vidya";
	void display()
	{
		System.out.println("College name"+ collegname);
		System.out.println("Teacher name:"+teachername);
	}
}
class Student extends Teacher
{
	String collegename="Govt Polytechnic";
	String teachername= "Veena";
	void display2()
	{
		System.out.println("Clg: used to be "+super.collegname);
		System.out.println("College now :"+collegename);
		System.out.println("Teacher : "+super.teachername);
		System.out.println("Teacher now :"+teachername);
	}
}
public class MultiLevelVariable {
	public static void main(String[] args) {
		Student s = new Student();
		s.display2();
	}
}
