package com.gentech.programs;
//employee dept insurance
    class Employees
    {
        String firstName;
        int age;

    }

    class Department {
        String deptName;
        int deptNumber;

    }

    class Insurance {
        String insuranceName;
        int noofyearsofinsurance;

    }
    public class Employee
    {

    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.firstName = "Diya";
        emp.age = 20;
        System.out.println("first name:" + emp.firstName);
        System.out.println("Age:" + emp.age);
        System.out.println("-------------------------");
        Department dept = new Department();
        dept.deptName = "DevOps";
        dept.deptNumber = 10;
        System.out.println("Department name :" + dept.deptName);
        System.out.println("Department Number:" + dept.deptNumber);
        System.out.println("-------------------------");

        Insurance ins = new Insurance();
        ins.insuranceName = "LIC";
        ins.noofyearsofinsurance = 20;
        System.out.println("Insurance Name :" + ins.insuranceName);
        System.out.println("No of years of insurance:" + ins.noofyearsofinsurance);
        System.out.println("-------------------------");
    }
}
