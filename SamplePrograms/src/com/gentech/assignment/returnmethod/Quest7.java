package com.gentech.assignment.returnmethod;

// Return 1st row in given 2d array
class FirstRow
{
    int[] getFirst(int a[][])
    {
        int res[]=new int[a[0].length];
        for (int j=0; j<a[0].length; j++) {
            res[j] = a[0][j];
        }
        return res;
    }
}

public class Quest7 {
    public static void main(String[] args) {
        FirstRow f = new FirstRow();
        int a[][] = {{1, 2}, {3, 4}};
        int c[] = f.getFirst(a);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
