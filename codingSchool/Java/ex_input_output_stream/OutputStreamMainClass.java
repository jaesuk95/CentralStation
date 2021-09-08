package ex_input_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMainClass {

    // FileWriter is a Writer that talks to files. Since a Java String internally uses chars (16 bit so they can
    // handle unicode), FileWriter is the natural class for use with Unicode Strings

    // FileOutputSteam is an OutputStream for writing bytes to a file. OutputStreams do not accept chars (or strings)
    // writes bytes directly

    // 1. If you are dealing with binary data (e.g. an image) use Streams.
    // 2. If you are using non-ASCII Unicode characters, e.g. Chinese, use Readers/Writers.
    // 3. If you are using ordinary ASCII text (the traditional 0-127 characters) you can (usually) use either.

    public static void m1() {
        try (FileOutputStream fos = new FileOutputStream("byte1.dat")) {
            String str = "Hello Java";
            byte[] b = str.getBytes();  // getBytes() converts a string into sequence of bytes and returns an array of bytes
            fos.write(b);
            System.out.println("byte1.dat file has been created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m2() {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.dat"))) {

            String str = "Hello JAVA 안녕 자바ㅇㄷ";
            byte[] b = str.getBytes("utf-8");
            bos.write(b);
            System.out.println("byte2.dat has been created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m3() {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte3.txt"))) {

            String str = "Hello JAVA 안녕 자바ㅇㄷ輯";
            byte[] b = str.getBytes();
            bos.write(b);
            System.out.println("byte3.dat has been created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }


}
