package org.example;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("ATGACTGTCGGAATATCCCGG"));
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
