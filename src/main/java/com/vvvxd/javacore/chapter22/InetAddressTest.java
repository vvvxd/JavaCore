package main.java.com.vvvxd.javacore.chapter22;

import java.net.*;

public class InetAddressTest {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.herbschildt.com");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++)
            System.out.println(SW[i]);
    }
}