package main.java.com.vvvxd.javacore.chapter07;

public class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test (double) a: " + a);
    }
}
