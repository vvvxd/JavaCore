package main.java.com.vvvxd.javacore.chapter08;

class A5 {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}

class B5 extends A5 {
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C5 extends A5 {
    void callme() {
        System.out.println("В методе callme() из класса С");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();
        A5 r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}