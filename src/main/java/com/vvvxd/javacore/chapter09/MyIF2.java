package main.java.com.vvvxd.javacore.chapter09;


public interface MyIF2 {

    int getNumber();

    default String getString() {
        return ("Объект типа String по умолчанию");
    }

    static int getDefaultNumber() {
        return 0;
    }
}
