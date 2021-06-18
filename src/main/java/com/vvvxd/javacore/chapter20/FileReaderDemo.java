package main.java.com.vvvxd.javacore.chapter20;

import java.io.*;

public class FileReaderDemo {

    public static void main(String args[]) {
        try (FileReader fr = new FileReader("file1.txt")) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}