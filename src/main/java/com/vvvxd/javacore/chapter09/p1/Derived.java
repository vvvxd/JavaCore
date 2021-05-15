package main.java.com.vvvxd.javacore.chapter09.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

// System. out. println("n_pri = "4 + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
