package main.java.com.vvvxd.javacore.chapter07;

public class Test {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test() {
        a = -1;
        b = -1;
    }

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
