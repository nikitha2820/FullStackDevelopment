package com.gentech.assignment.parameterisedconstructors;
class Employees
{
    String firstName;
    int age;
    Employees(String fn,int Age)
    {
        firstName = fn;
        age = Age;
        System.out.println("first name:" +firstName);
        System.out.println("Age:" +age);
        System.out.println("-------------------------");
    }
}

class Department {
    String deptName;
    int deptNumber;
    Department(String dn,int dno)
    {
        deptName = dn;
        deptNumber = dno;
        System.out.println("Department name :" +deptName);
        System.out.println("Department Number:" +deptNumber);
        System.out.println("-------------------------");
    }
}

class Insurance {
    String insuranceName;
    int noofyearsofinsurance;
    Insurance(String in,int inno)
    {
        insuranceName = in;
        noofyearsofinsurance =inno;
        System.out.println("Insurance Name :" + insuranceName);
        System.out.println("No of years of insurance:" + noofyearsofinsurance);
        System.out.println("-------------------------");
    }
}
public class Employee
{
    public static void main(String[] args) {
        Employees emp1 = new Employees("Diya",20);
        Employees emp2 = new Employees("Aditi",18);

        Department dept1 = new Department("DevOps",10);
        Department dept2 = new Department("Software Developer Engineer",20);

        Insurance ins1 = new Insurance("LIC",10);
        Insurance ins2 = new Insurance("Kotak",20);
    }
}
