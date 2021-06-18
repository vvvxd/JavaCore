package main.java.com.vvvxd.javacore.chapter22;

import java.net.*;
import java.util.*;

public class HttpURLDemo {
    public static void main(String args[]) throws Exception {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon =
                (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpCon.getRequestMethod());

        System.out.println("Код ответа: " + hpCon.getResponseCode());

        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок: ");
        for (String k : hdrField)
            System.out.println("Ключ: " + k + "Значение:" + hdrMap.get(k));
    }
}