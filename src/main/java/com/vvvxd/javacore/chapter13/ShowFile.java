package main.java.com.vvvxd.javacore.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя файла");
            return;
        }

        try {
            fin = new FileInputStream("/FIRST.txt");
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. ");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {

            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}