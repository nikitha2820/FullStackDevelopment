package com.gentech.assignment.methods;
//sum of prime numbers from 1 to 100
class PrimeSum {
    void sumPrimes() {
        int sum = 0;
        for (int num = 2; num <= 100; num++) {
            int flag = 0;
            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                sum += num;
            }
        }
        System.out.println("Sum  1-100 prime no: " + sum);
    }
}

public class Quest13 {
    public static void main(String[] args) {
        PrimeSum p = new PrimeSum();
        p.sumPrimes();
    }
}
