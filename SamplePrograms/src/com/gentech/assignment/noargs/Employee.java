package com.gentech.assignment.noargs;
class Employees
{
    String firstName;
    int age;
    Employees()
    {
        firstName = "Diya";
        age = 20;
        System.out.println("first name:" +firstName);
        System.out.println("Age:" +age);
        System.out.println("-------------------------");
    }
}

class Department {
    String deptName;
    int deptNumber;
    Department()
    {
        deptName = "DevOps";
        deptNumber = 10;
        System.out.println("Department name :" +deptName);
        System.out.println("Department Number:" +deptNumber);
        System.out.println("-------------------------");
    }
}

class Insurance {
    String insuranceName;
    int noofyearsofinsurance;
    Insurance()
    {
        insuranceName = "LIC";
        noofyearsofinsurance = 20;
        System.out.println("Insurance Name :" + insuranceName);
        System.out.println("No of years of insurance:" + noofyearsofinsurance);
        System.out.println("-------------------------");
    }
}
public class Employee
{
    public static void main(String[] args) {
        Employees emp = new Employees();
        Department dept = new Department();
        Insurance ins = new Insurance();
    }
}
