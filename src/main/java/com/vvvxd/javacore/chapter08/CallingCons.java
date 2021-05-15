package main.java.com.vvvxd.javacore.chapter08;

class A3 {
    A3() {
        System.out.println("В конструкторе А.");
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("В конструкторе В.");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("В конструкторе С.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C3 c = new C3();
    }
}