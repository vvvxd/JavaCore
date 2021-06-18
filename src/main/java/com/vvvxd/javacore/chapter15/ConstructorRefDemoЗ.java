package main.java.com.vvvxd.javacore.chapter15;

interface MyFunc9<R, T> {
    R func(T n);
}

class MyClass6<T> {
    private T val;

    MyClass6(T v) {
        val = v;
    }

    MyClass6() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass2 {
    String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemoЗ {

    static <R, T> R myClassFactory(MyFunc9<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String args[]) {
        MyFunc9<MyClass6<Double>, Double> myClassCons = MyClass6<Double>::new;
        MyClass6<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте тс равно " + mc.getVal());
        MyFunc9<MyClass2, String> myClassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}