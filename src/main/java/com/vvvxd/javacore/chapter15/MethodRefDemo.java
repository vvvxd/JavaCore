package main.java.com.vvvxd.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyString0ps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo {

    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        outStr = stringOp(MyString0ps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
