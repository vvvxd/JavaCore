package main.java.com.vvvxd.javacore.chapter07;

public class RetOb {
    public static void main(String args[]) {
        Test obl = new Test(2);
        Test ob2;
        ob2 = obl.incrByTen();
        System.out.println("ob1.a: " + obl.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.а после второго увеличения значения: " + ob2.a);
    }
}
