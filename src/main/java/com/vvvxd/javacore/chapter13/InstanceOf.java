package main.java.com.vvvxd.javacore.chapter13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("а является экземпляром А");
        if (b instanceof B)
            System.out.println("b является экземпляром В");
        if (c instanceof C)
            System.out.println("с является экземпляром С");
        if (c instanceof A)
            System.out.println("с можно привести к типу А");
        if (a instanceof C)
            System.out.println("а можно привести к типу С");
        System.out.println();
        A ob;
        ob = d;
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D)
            System.out.println("ob является экземпляром D");
        System.out.println();
        ob = c;
        System.out.println("ob теперь ссылается на с");

        if (ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя привести к типу D");
        if (ob instanceof A)
            System.out.println("ob можно привести к типу А");
        System.out.println();

        if (a instanceof Object)
            System.out.println("а можно привести к типу Object");
        if (b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if (c instanceof Object)
            System.out.println("с можно привести к типу к Object");
        if (d instanceof Object)
            System.out.println("d можно привести к типу к Object");
    }
}