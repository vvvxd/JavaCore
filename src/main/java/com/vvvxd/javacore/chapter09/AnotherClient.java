package main.java.com.vvvxd.javacore.chapter09;

public class AnotherClient  implements Callback{
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback() ");
        System.out.println("р в квадрате равно " + (p * p));
    }
}
