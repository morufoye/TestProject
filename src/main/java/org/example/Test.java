package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Test {

     Set<String> generatePalindrome(String input) {
         List<String> shuffledInput = shuffleString(input);
         return shuffledInput.stream()
                 .filter( x -> isPallindrome(x))
                 .collect(Collectors.toSet());
     }

    boolean isPallindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    List<String> shuffleString(String input) {
        String  shuffledString = "";
        List<String> shuffledList = new ArrayList<>();
         for (int i = 0; i < input.length(); i++) {
             shuffledString = input.substring(1) + input.charAt(0);
             input = shuffledString;
             shuffledList.add(shuffledString);
         }
         return shuffledList;
    }

    static int i = 0;
    static int k = 0;

    // Method to generate all permutations of a string
    public static Set<String> generatePermutations(String str) {
        Set<String> permutations = new HashSet<>(); // Set to store unique permutations
        // Base case: if the string is empty, add the empty string
        if (str == null || str.isEmpty()) {
            permutations.add("");
            return permutations;
        }
        // Get the first character of the string
        char firstChar = str.charAt(0);
        // Recur with the remaining substring
        String remainingStr = str.substring(1);
        Set<String> remainingPermutations = generatePermutations(remainingStr);
        // Insert the first character into every possible position of the remaining permutations
        for (String perm : remainingPermutations) {
            for (int i = 0; i <= perm.length(); i++) {
                System.out.println(" pem " + perm);
                System.out.println(" firstChar " + firstChar);
                String newPerm = perm.substring(0, i) + firstChar + perm.substring(i);
                permutations.add(newPerm);
            }
        }
        return permutations;
    }

    static Set<String> doPermute(String input){
        Set<String> permutations = new HashSet<>();
        permute(input, "", permutations);
        return permutations;
    }

    static void permute(String entry, String permuted, Set<String> permutations) {
        if ("".equals(entry)) {
            permutations.add(permuted);
        } else {
            System.out.println(" working on entry " + entry);
            for (int i = 0; i < entry.length(); i++) {
                String curr = entry.substring(0, i) + entry.substring(i + 1);
                System.out.println(" current 0 is  " + i);
                System.out.println(" entry.substring(0, i) " + entry.substring(0, i));
                System.out.println(" entry.substring(i + 1) " + entry.substring(i + 1));
                System.out.println(" current string " + curr);
                System.out.println(" permuted " + permuted  + entry.charAt(i));
                String nextChar = permuted  + entry.charAt(i);
                System.out.println("                                 ");
                permute(curr, nextChar, permutations);
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        //System.out.println(test.generatePalindrome("baab"));
        //System.out.println(generatePermutations("abba"));
        //System.out.println("-------------------------------");
        System.out.println(doPermute("abba"));
        //System.out.println(solution("aabbcc"));
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
    }

    static char solution(String input) {
        char result = '_';
       for (int i = 0; i < input.length(); i++) {
            if (countChars(input, input.charAt(i)) == 1) {
                result = input.charAt(i);
                break;
            }
        }
        return result;
    }

    static int countChars(String input, char toCount) {
        AtomicInteger count = new AtomicInteger();
        List<Character> chars = input.chars().mapToObj(c -> (char) c).toList();
        chars.forEach( x -> {
            if ( x.equals(toCount)) {
                count.getAndIncrement();
            }
        });
        return count.get();
    }
    static void test() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", map.getOrDefault("a", 0) + 1);
        //Collections.sort(arrayList);
    }
}
