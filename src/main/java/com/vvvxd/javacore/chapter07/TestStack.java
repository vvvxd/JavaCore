package main.java.com.vvvxd.javacore.chapter07;

public class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Стек в mystackl:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;}
    }
}
