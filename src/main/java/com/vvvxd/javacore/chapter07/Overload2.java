package main.java.com.vvvxd.javacore.chapter07;

public class Overload2 {
    public static void main(String args[]) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}