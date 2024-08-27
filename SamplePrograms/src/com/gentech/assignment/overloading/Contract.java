package com.gentech.assignment.overloading;
class Contracts
{
    Contracts(String contractReason)
    {
        System.out.println("reason of contract:"+contractReason);
    }
    Contracts(int years)
    {
        System.out.println("years of contract:"+years);
    }
    Contracts(double amt)
    {
        System.out.println("amount to be paid:"+amt);
    }
}
public class Contract {
    public static void main(String[] args) {
        Contracts c1=new Contracts("Land");
        Contracts c2=new Contracts(1);
        Contracts c3=new Contracts(20000.90);
    }
}
