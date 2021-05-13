package main.java.com.vvvxd.javacore.chapter07;

public class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);
        System.out.println("a, b, и с: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
