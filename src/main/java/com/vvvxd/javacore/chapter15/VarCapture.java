package main.java.com.vvvxd.javacore.chapter15;

interface MyFunc {
    int func(int n);
}

public class VarCapture {

    public static void main(String args[]) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            return v;
        };
//        num++;
//        num = 9;
    }
}
