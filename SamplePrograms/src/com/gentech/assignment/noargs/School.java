package com.gentech.assignment.noargs;
class Student{
    String studentName;
    int rollno;
    Student()
    {
        studentName = "Riya Kapoor";
        rollno = 22;
        System.out.println("Student Name:" +studentName);
        System.out.println("Roll No:" + rollno);
        System.out.println("-------------------------");

    }

}

class Library {
    String bookName;
    int bookID;
    Library()
    {
        bookName = "DSA";
        bookID = 234;
        System.out.println("Book Name :" + bookName);
        System.out.println("Book ID:" +bookID);
        System.out.println("-------------------------");
    }

}

class Sports {
    String sportsName;
    int sportsID;
    Sports()
    {
        sportsName = "Cricket";
        sportsID = 128;
        System.out.println("Sports Name :" + sportsName);
        System.out.println("Sports ID:" + sportsID);
        System.out.println("-------------------------");
    }

}
class ComputerLab{
    String labName;
    int labID;
    ComputerLab()
    {
        labName = "OOPS LAB";
        labID = 90;
        System.out.println("Computer Lab Name :" +labName);
        System.out.println("Lab ID:" +labID);
        System.out.println("-------------------------");
    }

}
public class School
{

    public static void main(String[] args) {
        Student stu = new Student();

        Library lib = new Library();

        Sports spo = new Sports();

        ComputerLab cmp = new ComputerLab();

    }
}

