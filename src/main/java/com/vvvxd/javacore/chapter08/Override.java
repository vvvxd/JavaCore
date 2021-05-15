package main.java.com.vvvxd.javacore.chapter08;

class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String args[]) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show("Это кто: ");
        subOb.show();
    }
}