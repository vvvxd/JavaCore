package main.java.com.vvvxd.javacore.chapter13;

public class NativeDemo {

    int i;

    public static void main(String args[]) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob. і перед вызовом платформенно - ориентированного метода: "+ob.i);
        ob.test();
        System.out.println("Содержимое переменной ob. і после вызова платформенно - ориентированного метода: "+ob.i);
    }

    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
