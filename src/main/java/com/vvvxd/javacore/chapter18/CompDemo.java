package main.java.com.vvvxd.javacore.chapter18;

import java.util.*;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}


class CompDemo {
    public static void main(String args[]) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("E");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
