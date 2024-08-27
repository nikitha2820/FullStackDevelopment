package com.gentech.assignment.methods;
class Prime
{
    void displayPrimes() {
        for (int num = 2; num <= 50; num++) {
            int flag = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(num + " ");
            }
        }
    }
}

public class Quest11 {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.displayPrimes();
    }
}
