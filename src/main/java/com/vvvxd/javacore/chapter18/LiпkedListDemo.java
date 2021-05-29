package main.java.com.vvvxd.javacore.chapter18;

import java.util.LinkedList;

public class LiпkedListDemo {

    public static void main(String args[]) {
        LinkedList<String> il = new LinkedList<String>();
        il.add("F");
        il.add("B");
        il.add("D");
        il.add("E");
        il.add("C");
        il.addLast("Z");
        il.addFirst("A");
        il.add(1, "A2");
        System.out.println("Исходное содержимое связного списка il: " + il);
        il.remove("F");
        il.remove(2);
        System.out.println("Содержимое связного списка il после удаления элементов: " + il);
        il.removeFirst();
        il.removeLast();
        System.out.println("Содержимое связного списка il после удаления первого и последнего элементов: " + il);
        String val = il.get(2);
        il.set(2, val + " изменено");
        System.out.println("Содержимое связного списка il после изменения: " + il);
    }
}
