package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalanceChecker {


    public static String isBalanced(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            if (i < s.length() - 2) {
                if (!checkNextCharacterCompatibility(s.charAt(i), s.charAt(i + 1))) {
                    return "NO";
                }
            }
        }
        while (!s.isEmpty()) {
            if ("NO".equalsIgnoreCase(s)) {
                return "NO";
            }
            if (s.length() == 2) {
                switch(s.charAt(0)) {
                    case '{': return '}' == s.charAt(1) ? "YES" : "NO";
                    case '(': return ')' == s.charAt(1) ? "YES" : "NO";
                    case '[': return ']' == s.charAt(1) ? "YES" : "NO";
                }
            }
            s = removeFirstPairAndReturnRemnant(s.charAt(0), s.substring( 1));
        }
        return "YES";
    }

    static String removeFirstPairAndReturnRemnant(char right, String input){
        char left = switch (right) {
            case '{' -> '}';
            case '(' -> ')';
            case '[' -> ']';
            default -> 0;
        };
        if (left == 0) {
            return "NO";
        }
        int i = input.indexOf(left);
        if (i != -1) {
            input = input.substring(0, i) + input.substring(i + 1);
        }
        return input;
    }

    static boolean checkNextCharacterCompatibility(char right, char left){
        if ('{' == left || '(' == left || '[' == left) {
            return true;
        }
        if ('}' == right || ')' == right || ']' == right) {
            return true;
        }
        return switch (right) {
            case '{' -> '}' == left;
            case '(' -> ')' == left;
            case '[' -> ']' == left;
            default -> false;
        };
    }

    static boolean balanciaga(String s) {
        char[] inputArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

        }

        for (char x : inputArray) {
            if (x == '(' || x == '{' || x == '[')  {
                stack.push(x);
            } else if (x == ')' || x == '}' || x == ']') {
                if (stack.isEmpty()){
                    return false;
                }
                char y = stack.pop();
                    if (('}' == x && y != '{')
                    || (')' == x && y != '(')
                    || (']' == x && y != '[') ) {
                        return false;
                    }
            }
        }
       return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(balanciaga("}][}}(}][))]"));;
        System.out.println(balanciaga("[](){()}"));
        System.out.println(balanciaga("()"));
        System.out.println(balanciaga("({}([][]))[]()"));
        System.out.println(balanciaga("{)[](}]}]}))}(())("));
        System.out.println(balanciaga("([[)"));
    }
}
