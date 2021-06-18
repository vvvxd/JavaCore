package main.java.com.vvvxd.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelWrite1 {
    public static void main(String args[]) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        try {
            fOut = new RandomAccessFile("test.txt", "rw");
            fChan = fOut.getChannel();
            mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++)
                mBuf.put((byte)(i));
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fChan != null) fChan.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка закрытия канала. ");
            }
            try {
                if (fOut != null) fOut.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка закрытия файла. ");
            }
        }
    }
}