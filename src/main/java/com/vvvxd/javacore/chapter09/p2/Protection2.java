package main.java.com.vvvxd.javacore.chapter09.p2;

import main.java.com.vvvxd.javacore.chapter09.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
// System. out. println("n = " + n);
// System. out. println("n_pri =" + n_pri);
        System.out.println("n pro = " + n_pro);
        System.out.println("n pub = " + n_pub);

    }
}
