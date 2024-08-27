package com.gentech.assignment.overloading;

import java.sql.SQLOutput;

class User
{
    User(String userName)
    {
        System.out.println("User Name:"+userName);
    }

    User(int age)
    {
        System.out.println("Age:"+age);
    }
    User(double income)
    {
        System.out.println("Income :"+income);
    }
}

public class Users {
    public static void main(String[] args) {
        User u1 = new User("Aditi");
        User u2 = new User(20);
        User u3 = new User(2500.58);
    }
}
