package main.java.com.vvvxd.javacore.chapter03;

class Scope {
    public static void main(String args[]) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println(" x и у: " + x + " " + y);
            x = y * 2;
        }
        int у = 100;
        System.out.println(" x равно " + x);
    }
}
