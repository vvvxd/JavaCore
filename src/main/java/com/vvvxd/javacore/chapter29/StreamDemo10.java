package main.java.com.vvvxd.javacore.chapter29;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitter = myStream.spliterator();

        Spliterator<String> splitItr2 = splitter.trySplit();

        if (splitItr2 != null) {
            System.out.println("Результат, выводимый итератором splitItr2:");
            splitItr2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nРезультат, выводимый итератором splitItr:");
        splitter.forEachRemaining((n) -> System.out.println(n));
    }
}
