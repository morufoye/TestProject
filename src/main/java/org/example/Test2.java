package org.example;

public class Test2 {

    static boolean pushFlag = false;
    static boolean obstructionFlag  = false;

    static String solution(String input) {
        String result = 'P' == input.charAt(0) ? "1" : "0";
        for (int i = 1; i < input.length(); i++) {
            if ('P' == input.charAt(i)) {
                pushFlag = !pushFlag;;
                obstructionFlag = false;
            }
            if ('O' == input.charAt(i)) {
                obstructionFlag = !obstructionFlag;
                pushFlag = false;
            }
            if (pushFlag) {
                result = buildResult(result, 1);
            }
            if (obstructionFlag) {
                result = buildResult(result, -1);
            }
            if (pushFlag == false && obstructionFlag == false) {
                result = buildResult(result, 0);
            }
        }
        return result;
    }

    static String buildResult(String current, int latest) {
        int lastDigit = Integer.parseInt(String.valueOf(current.charAt(current.length() -1)));
        int newString = lastDigit + latest;
        if (newString > 5) {
            newString = 5;
        }
        if (newString < 0) {
            newString = 0;
        }
        return  current + newString;
    }

    public static void main(String[] args) {
        System.out.println(solution("..P...O....."));
        System.out.println(solution("..P.P..."));
    }

}
