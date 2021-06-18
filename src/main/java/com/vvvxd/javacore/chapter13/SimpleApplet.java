package main.java.com.vvvxd.javacore.chapter13;

import java.applet.*;
import java.awt.*;
/*
* <applet code="SimpleApplet" width=200 height=бO></applet>
* */

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
