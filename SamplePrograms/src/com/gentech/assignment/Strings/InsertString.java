package com.gentech.assignment.Strings;
public class InsertString {
    public static void main(String[] args) {
        String original = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String target = "DAY";
        String result = "";

        int i = 0;
        int len = target.length();

        while (i <= original.length() - len) {
            result += original.charAt(i);
            if (original.substring(i, i + len).equals(target)) {
                result += "DAY,";
                i += len - 1;
            }
            i++;
        }
        result += original.substring(i);

        System.out.println("Modified string: " + result);
    }
}
