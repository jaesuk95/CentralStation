package ex_reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMainClass {
    // Writer
    // 1. FileWrite, PrintWriter, BufferedWriter 등
    // FileWriter writes directly into Files, and should be used only when the number of writes is less
    // BufferedWriter is almost similar to FileWriter, but it uses internal buffer to write data into File
    // FileWriter 는 매우 느리다는 특징, BufferedWriter 를 이용하면, I/O 접근하는데 시간을 절약할 수 있다.

    // 비유를 들자면, 디스크에 접근하려면 10초씩 기다려야한다. 그러면 한 글자 쓰고 10초 기다리고 한글자 쓰고 10초 씩 기다리는건 비효율적이다.
    // 모았다가 한꺼번에 써야 10초씩 횟수가 줄어든다. 10초가 아닌 CPU 를 생각해보자, 한번 접근하기 위해 기다려야 하는 시간이 엄청 길기 때문에,
    // 그런 지연 시간을 최소화 하기 위해 모아뒀다 쓰는것이 중요합니다.

    // The BufferedWriter will save up many of the little writes and send only large chunks of data to the FileWriter.
    // Writing one large chunk to a file is more efficient than many small ones because each call to FileWriter.write()
    // involves a call to the operating system, and those are slow.

    public static void m1() {
        FileWriter fw = null;

        try {
            fw = new FileWriter("text1.txt");
            char[] cbuf = {'h', 'i'};
            int c = ' ';
            String str = "java";

            // transfer data to file
            fw.write(cbuf);
            fw.write(c);
            fw.write(str);
            System.out.println("text1.txt 파일로 생성 완료");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)     // data 가 없을 경우
                    fw.close();     // fw. 는 꺼라
            } catch (IOException e) {
                e.printStackTrace();
            }}}

    public static void m2() {
        // resource method, contains try and catch and excludes close()
        try (FileWriter fw = new FileWriter("text2.txt")) {
            fw.write("하이 자바");
            fw.write("\n");
            fw.write("만나서 반갑다");
        } catch (IOException e) {
            e.printStackTrace();
        }}

    public static void m3() {
        try (FileWriter fw = new FileWriter("text3.txt")) {
            char[] cbuf = { 'h', 'e', 'l', 'l', 'o' };
            fw.write(cbuf, 0, 3);

            String space = "\n";
            fw.write(space);

            String str = "shell";
            fw.write(str,1,4);

        } catch (IOException e) {
            e.printStackTrace();
        }}

    public static void m4() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt"))) {
            bw.write("안녕하세요");
            bw.write("\n");
            bw.write("반갑습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
    }
}
