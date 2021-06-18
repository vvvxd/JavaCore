package main.java.com.vvvxd.javacore.chapter15;

interface MyFunc8<T> {
    MyClass4<T> func(T n);
}

class MyClass4<T> {
    private T val;

    MyClass4(T v) {
        val = v;
    }

    MyClass4() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String args[]) {
        MyFunc8<Integer> myClassCons = MyClass4<Integer>::new;
        MyClass4<Integer> mc = myClassCons.func(100);
        System.out.println("Значение val в объекте тс равно " + mc.getVal());
    }
}