package com.gentech.assignment.innerouter;
//two private inner class, execute inner and outer class
class Outer3
{
    int age;
    Inner3b inner3b=new Inner3b();
    Inner3a inner3a=new Inner3a();
    void showfirstName()
    {
        inner3a.firstname="Maya";
        System.out.println("first name:"+inner3a.firstname);
    }
    void showlastName()
    {
        inner3b.lastName="Iyenger";
        System.out.println("lastname:"+inner3b.lastName);
    }
    private class Inner3a
    {
        String firstname;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
    }
    private class Inner3b
    {
        String lastName;

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
    void showAge()
    {
        age=22;
        System.out.println("age:"+age);
    }
}
public class TwoPrivateClass
{
    public static void main(String[] args) {
        Outer3 o3=new Outer3();
        o3.showAge();
        o3.showfirstName();
        o3.showlastName();
    }
}
