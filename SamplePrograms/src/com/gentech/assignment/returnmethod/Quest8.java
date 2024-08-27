package com.gentech.assignment.returnmethod;

// Return the 7th table in reverse
class Tab7 {
    int[] getReverseTab() {
        int res[] = new int[10];
        for (int i = 10; i>=1; i--) {
            res[10-i] = 7 * i;
        }
        return res;
    }
}

public class Quest8 {
    public static void main(String[] args) {
        Tab7 t = new Tab7();
        int c[] = t.getReverseTab();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
