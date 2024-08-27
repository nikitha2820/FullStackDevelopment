package com.gentech.assignment.methods;
//count of prime number from 50 to 150
class PrimeCount {
    void countPrimes() {
        int count = 0;
        for (int num = 50; num <= 150; num++) {
            int flag = 0;
            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && num > 1) {
                count++;
            }
        }
        System.out.println("Count of 50-150 prime no: " + count);
    }
}

public class Quest12 {
    public static void main(String[] args) {
        PrimeCount p = new PrimeCount();
        p.countPrimes();
    }
}
