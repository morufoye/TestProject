package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String QString = scanner.nextLine();
        int Q = Integer.parseInt(QString);

        List<String> lastResults = new LinkedList<>();
        String[] ops = new String[Q];

        for (int i = 0; i < Q; i++ ) {
            ops[i] = scanner.nextLine();
        }
        scanner.close();

        String S = "";
        for (String x : ops) {
            if (x.length() > 1){
                String[] s = x.split(" ");
                int action = Integer.parseInt(s[0]);
                String input = s[1];
                switch (action) {
                    case 1: S = append(S, input, lastResults); break;
                    case 2: S = delete(S, Integer.parseInt(input), lastResults); break;
                    case 3: printkth(S, Integer.parseInt(input));
                }
            } else {
                S = undo(lastResults);
            }
        }
    }

    static String append(String current, String toAppend, List<String> lastResults){
        lastResults.add(current);
        return current + toAppend;
    }

    static String delete(String current, int toDelete, List<String> lastResults){
        lastResults.add(current);
        return current.substring(0, current.length() - toDelete);
    }

    static String undo(List<String> lastResults){
        return lastResults.remove(lastResults.size() - 1);
    }

    static void printkth(String current, int k){
        System.out.println(current.charAt(k - 1));
    }
}
