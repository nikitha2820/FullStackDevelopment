package com.gentech.assignment.returnmethod;

// Reverse of elements of given 1d double array
class Reverse {
    double[] getReverse(double a[]) {
        double[] res = new double[a.length];
        for (int i = a.length-1 ;i>=0 ; i--) {
            res[(a.length-1)-i] = a[i];
        }
        return res;
    }
}

public class Quest4 {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        double a[] = {10.10, 20.20, 30.30,40.98};
        double c[] = r.getReverse(a);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
