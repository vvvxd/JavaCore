package main.java.com.vvvxd.javacore.chapter07;

public class PassObjRe {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a+" " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a ob.b после вызова:  " + ob.a +" "+ ob.b);
    }
}
