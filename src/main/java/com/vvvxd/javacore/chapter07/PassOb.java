package main.java.com.vvvxd.javacore.chapter07;

public class PassOb {
    public static void main(String args[]) {
        Test obl = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("obl == ob2: " + obl.equals(ob2));
        System.out.println("ob1 == ob3: " + obl.equals(ob3));
    }
}
