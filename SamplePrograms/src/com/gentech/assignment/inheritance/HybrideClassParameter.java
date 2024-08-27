package com.gentech.assignment.inheritance;
class Company{
    String compname;
    Company(String compname)
    {
        this.compname=compname;
        System.out.println("Company name :"+compname);
    }
}
class Department extends Company {
    String deptname;
    Department(String deptname,String comname)
    {
        super(comname);
        this.deptname = deptname;
    }
    void displayDeptname()
    {
        System.out.println("Dpeartment name: "+deptname);
    }
}
class Clients extends Company {
    String clientName;
    Clients(String clientName,String compname)
    {
        super(compname);
        this.clientName=clientName;
    }
    void displayClenit()
    {
        System.out.println("customer name: "+clientName);
    }
}
class Employee1 extends Department
{
    String empnname ;
    Employee1(String deptname,String empname,String comname)
    {
        super(deptname,comname);
        this.empnname=empname;
    }
    void displayEmp()
    {
        System.out.println("Employee name:"+empnname);
        super.displayDeptname();
    }
}
public class HybrideClassParameter {
    public static void main(String[] args) {
        Employee1 e = new Employee1("Accounts","Shashank","Accenture");
        e.displayEmp();
        System.out.println("------------------------------");
        Clients c = new Clients("Clientt","ZARA");
        c.displayClenit();

    }

}

