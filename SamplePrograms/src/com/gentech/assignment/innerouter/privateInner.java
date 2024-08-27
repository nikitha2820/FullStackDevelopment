package com.gentech.assignment.innerouter;
//inner class is private ,and  execute outer and inner class members
class Outer
{
    String firstName;
    Inner inner=new Inner();
    void showAge()
    {
        inner.age=22;
        System.out.println("Age:"+inner.age);
    }

    private class Inner

    {
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    void showFN()
    {
        firstName="Santosh";
        System.out.println("FirstName:"+firstName);
    }
}
public class privateInner {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.showFN();
        outer.showAge();
    }
}