package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        Main tMain = new Main();

        Father tFather = new Father();
        tFather.setAge(23);
        tFather.setLevel("300");
        tFather.setOccupation("Doctor");

        //System.out.println(" ocuupation  " + tFather.getOccupation());
        //System.out.println(" age  " + tFather.getAge());
        //System.out.println(" level  " + tFather.getLevel());

        List<Integer> whholeList = new ArrayList<>();
        whholeList.add(1);
        whholeList.add(2);
        whholeList.add(3);
        whholeList.add(4);

        int size = whholeList.size();
        List<Integer> splitListOne = new ArrayList<>();
        List<Integer> splitListTwo = new ArrayList<>();

        splitListOne.addAll(whholeList.subList(0, size/2));
        splitListTwo.addAll(whholeList.subList(size/2, size));

        for (int a : splitListOne) {
            System.out.println(" splitListOne " + a);
        }

        for (int a : splitListTwo) {
            System.out.println(" splitListTwo " + a);
        }

        System.out.println(" =====> " + tMain.getClass());

        /*
        List<Integer> courses = new ArrayList<>();
        courses.add(45);
        courses.add(78);
        courses.add(56);

        DataModel dataModel1 = new DataModel("Moruff Oyewole", "CLI7864", courses);
        DataModel dataModel2 = new DataModel("Alabi Yellow", "CLI345", courses);
        DataModel dataModel3 = new DataModel("Apa Elere", "CLI35647", courses);

        List<DataModel> dataModels = new ArrayList<>();
        dataModels.add(dataModel1);
        dataModels.add(dataModel2);
        dataModels.add(dataModel3);

        BigDecimal sum = dataModels.stream()
                                   .flatMap(x -> x.courses.stream())
                                   .map(x -> BigDecimal.valueOf(x))
                                   .reduce(BigDecimal::add)
                                           .orElse(BigDecimal.ZERO);
        //System.out.println("=========> " + sum);
        int num = 12346656;
        char[] numArray = String.valueOf(num).toCharArray();

        List<Character> ut = new ArrayList<>();
        for (char a : numArray) {
            ut.add(a);
        }
        AtomicReference<String> r = new AtomicReference<>("");
        ut.stream().filter(x->x % 2 == 0).forEach(x -> r.set(r.get() + x));

        AtomicReference<String> x = new AtomicReference<>("");
        IntStream.range(0, courses.size()).forEach(i -> {
        x.set(x.get() + courses.get(i));
        });
        //System.out.println(x.get());
        String re = ut.stream().map(y -> y.toString()).collect(Collectors.joining(", ")).toString();
        System.out.println(re);

         */
    }

}