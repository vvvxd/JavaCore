package main.java.com.vvvxd.javacore.chapter05;

public class BreakLoopЗ {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // выход из цикла, значение
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
