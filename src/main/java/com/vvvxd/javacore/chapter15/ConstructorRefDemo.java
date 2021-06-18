package main.java.com.vvvxd.javacore.chapter15;

interface MyFunc7 {
    MyClass3 func(int n);
}

class MyClass3 {
    private int val;

    MyClass3(int v) {
        val = v;
    }
    MyClass3() {
        val = 0;
    }
    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String args[]) {
        MyFunc7 myClassCons = MyClass3::new;
        MyClass3 mc = myClassCons.func(100);
        System.out.println("Значение val в объекте тс равно " + mc.getVal());
    }
}