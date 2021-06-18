package main.java.com.vvvxd.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ExplicitChannelWrite1 {
    public static void main(String args[]) {
        FileOutputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        try {
            fOut = new FileOutputStream("test.txt");
            fChan = fOut.getChannel();
            mBuf = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));
            mBuf.rewind();
            fChan.write(mBuf);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fChan != null) fChan.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала. ");
            }
            try {
                if (fOut != null) fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла. ");
            }
        }
    }
}