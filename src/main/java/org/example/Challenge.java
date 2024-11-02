package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Challenge {

    public static Integer[] solution(Integer[] arr, int n, int val1){
        Integer[] response = new Integer[3];
        int less = 0;
        int equal = 0;
        int greater = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < val1)
                less++;
            if (arr[i] == val1)
                equal++;
            if (arr[i] > val1)
                greater++;
        }
        response[0] = less;
        response[1] = equal;
        response[2] = greater;
        return response;
    }

    public static Integer[] solution2(Integer[] arr, int n, int val1) {
        Integer[] response = new Integer[3];
        AtomicInteger less = new AtomicInteger(0);
        AtomicInteger equal = new AtomicInteger(0);
        AtomicInteger greater = new AtomicInteger(0);
        Arrays.stream(arr).toList().stream().forEach(x -> {
            if (x < val1)
                less.set(less.get() + 1);
            if (x == val1)
                equal.set(equal.get() + 1);
            if (x > val1)
                greater.set(greater.get() + 1);
        });
        response[0] = less.get();
        response[1] = equal.get();
        response[2] = greater.get();
        return response;
    }

    static Integer[] solution3(Integer[] input, int target) {
        Integer[] response = {0, 0};
         for (int i = 0; i < input.length; i++) {
              for (int j = i + 1; j < input.length; j++) {
                   if (input[i] + input[j] == target) {
                       response[0] = i;
                       response[1] = j;
                       return response;
                   }
              }
         }
         return response;
    }

    public static void main(String[] args) {

        String test = "Moruff";
        System.out.println(test.charAt(3));

        System.out.println(test.substring(0, test.length() - 3));

        List<String> testList = new ArrayList<>();
        testList.add("One");
        testList.add("Two");
        testList.add("Three");
        testList.add("Four");

        System.out.println(testList.get(testList.size() - 1));
        testList.remove(testList.size() - 1);
        System.out.println(testList.get(testList.size() - 1));

        //Integer [] arr = {2, 4, 6, 8, 10};
        //System.out.println(Arrays.stream(solution(arr, 5, 6)).toList());
        //System.out.println(Arrays.stream(solution2(arr, 5, 6)).toList());
    }



}
