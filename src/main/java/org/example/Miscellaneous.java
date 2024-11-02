package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Miscellaneous {

    public static void main(String[] args) {
        String[] arrayOld = {"64", "25", "12", "22", "11"};
        List<String> intList = Arrays.asList(arrayOld);

        int[] array = {3, 1, 2, 5, 4};
        List<Integer> arrayList = new ArrayList<>(IntStream.of(array)
                .boxed()
                .toList());
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        int[] arrayG = arrayList.stream()
                .mapToInt(Integer::intValue).toArray();
               // .collect(Collectors.toCollection(ArrayList::new));
    }




}
