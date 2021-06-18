package main.java.com.vvvxd.javacore.chapter21;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String args[]) {
        String dirname = "";
        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}