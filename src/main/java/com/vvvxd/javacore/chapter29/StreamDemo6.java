package main.java.com.vvvxd.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);
        System.out.print("Исходные значения из списка myList:");
        myList.stream().forEach((a) -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.print("Максимально допустимые пределы значенийиз списка myList:");
        cStrm.forEach((a) -> System.out.print(a + " "));
    }
}