package com.gentech.assignment.Strings;

public class DeleteString {
    public static void main(String[] args) {
        String original = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String target = "DAY";
        String result = "";
        int i = 0;
        int len = target.length();

        while (i <= original.length() - len) {
            if (original.substring(i, i + len).equals(target)) {
                i += len;
            } else {
                result += original.charAt(i);
                i++;
            }
        }
        result += original.substring(i);

        System.out.println("Modified string: " + result);
    }
}
