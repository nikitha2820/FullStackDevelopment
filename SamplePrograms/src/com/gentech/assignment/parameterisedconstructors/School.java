package com.gentech.assignment.parameterisedconstructors;
class Student{
    String studentName;
    int rollno;
    Student(String sn, int Rollno)
    {
        studentName = sn;
        rollno = Rollno;
        System.out.println("Student Name:" +studentName);
        System.out.println("Roll No:" + rollno);
        System.out.println("-------------------------");
    }
}

class Library {
    String bookName;
    int bookID;
    Library(String bn, int bid)
    {
        bookName = bn;
        bookID = bid;
        System.out.println("Book Name :" + bookName);
        System.out.println("Book ID:" +bookID);
        System.out.println("-------------------------");
    }

}

class Sports {
    String sportsName;
    int sportsID;
    Sports(String sn,int sid)
    {
        sportsName = sn;
        sportsID = sid;
        System.out.println("Sports Name :" + sportsName);
        System.out.println("Sports ID:" + sportsID);
        System.out.println("-------------------------");
    }

}
class ComputerLab{
    String labName;
    int labID;
    ComputerLab(String ln, int lid)
    {
        labName = ln;
        labID = lid;
        System.out.println("Computer Lab Name :" +labName);
        System.out.println("Lab ID:" +labID);
        System.out.println("-------------------------");
    }

}
public class School
{

    public static void main(String[] args) {
        Student stu1 = new Student("Riya",10);
        Student stu2 = new Student("Gorge",70);

        Library lib1 = new Library("DSA",908);
        Library lib2 = new Library("Time",990);

        Sports spo1 = new Sports("Cricket",200);
        Sports spo2 = new Sports("Football",800);

        ComputerLab cmp1 = new ComputerLab("OOPS LAB", 800);
        ComputerLab cmp2 = new ComputerLab("JAVA LAB", 801);
    }
}


