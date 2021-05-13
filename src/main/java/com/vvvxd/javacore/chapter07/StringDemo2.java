package main.java.com.vvvxd.javacore.chapter07;

public class StringDemo2 {
    public static void main(String args[]) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;
        System.out.println("Длина строки str0bl : " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке str0b1: " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("str0bl == str0b2");
        else
            System.out.println("str0b1 != str0b2");

        if (strOb1.equals(strOb3))
            System.out.println("str0b1 == str0b3");
        else
            System.out.println("str0b1 != str0b3");
    }
}
