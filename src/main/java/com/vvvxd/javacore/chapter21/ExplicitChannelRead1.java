package main.java.com.vvvxd.javacore.chapter21;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ExplicitChannelRead1 {
    public static void main(String args[]) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;
        try {

            fIn = new FileInputStream("test.txt");
            fChan = fIn.getChannel();

            mBuf = ByteBuffer.allocate(128);
            do {

                count = fChan.read(mBuf);

                if (count != -1)
                    mBuf.rewind();
                for (int i = 0; i < count; i++)
                    System.out.print((char) mBuf.get());
            }
            while (count != -1);
            System.out.println();
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
                if (fIn != null) fIn.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка закрытия файла. ");
            }
        }
    }
}
