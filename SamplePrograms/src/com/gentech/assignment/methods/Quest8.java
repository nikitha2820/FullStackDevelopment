package com.gentech.assignment.methods;
//sum of all numbers
class SumAll {
    void sumAll(int[] num) {
        int sum = 0;
        for (int i=0; i< num.length;i++) {
            sum +=num[i];
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}

public class Quest8 {
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3, 4, 5};
        SumAll s1 = new SumAll();
        s1.sumAll(num);
    }
}
