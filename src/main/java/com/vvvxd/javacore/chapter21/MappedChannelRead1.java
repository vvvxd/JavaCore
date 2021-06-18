package main.java.com.vvvxd.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelRead1 {

    public static void main(String args[]) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;
        try {
            fIn = new FileInputStream("test.txt");
            fChan = fIn.getChannel();
            fSize = fChan.size();
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fChan == null) fChan.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала.");
            }
            try {
                if (fIn == null) fIn.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}