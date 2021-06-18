package main.java.com.vvvxd.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

class StreamDemo9 {
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

        while (splitter.tryAdvance((n) -> System.out.println(n))) ;
    }
}