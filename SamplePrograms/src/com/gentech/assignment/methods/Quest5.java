package com.gentech.assignment.methods;
class SumDobule
{
    void SumDobule(double a[][])
    {
        double sum=0.00;
            for(int j=0;j<a[1].length;j++)
            {
                sum=sum+a[1][j];
            }
        System.out.println(sum);
    }
}
public class Quest5 {
    public static void main(String[] args) {
        SumDobule s1=new SumDobule();
        double e[][]={{1.11,2.22},{3.33,4.44}};
        s1.SumDobule(e);

    }
}
