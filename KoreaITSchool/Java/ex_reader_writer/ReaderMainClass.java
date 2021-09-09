package ex_reader_writer;

import java.io.*;

public class ReaderMainClass {

    public static void m1() {

        try (FileReader fr = new FileReader("text1.txt")) {

            int c = 0;

            while (true) {
                c = fr.read();  // 한 글자 읽어서 C 에 저장, 파일을 모두 읽은 후에는 -1 으로 자동적으로 반환
                System.out.print((char) c); // 그대로 출력

                if (c == -1) {    // 파일이 끝나면, EOF 읽음, EOF 의 값이 -1, EOF 는 캐릭터에 저장이 된다.
                    System.out.println("\ntext1.txt 파일 읽기 완료");
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("text.1 not found");
        } catch (IOException e) {
            System.out.println("file read error");
        }
    }

    public static void m2() {

        try (FileReader fr = new FileReader("text2.txt")) {

            char[] cbuf = new char[5];
            int readCount = 0;

            while (true) {      // loop 생성, for 안에
                readCount = fr.read(cbuf);

                for (int i = 0; i < readCount; i++) { // first readCount is 5, then 5 again and 3
                    // for 안에 있는 5,5,3 은 while loop 에서 돌아올때마다 순서대로 배열(char[5])을 읽는다. !!
                    System.out.println(cbuf[i]);    // 글자 하나하나 씩 출력
                }

                if (readCount == -1) {  // for 문을 다 읽은뒤, readCount 는 End Of File 이기 때문에 -1 로 반환된다.
                    System.out.println("\ntext2.txt 파일 읽기 완료");
                    break;
                }

                // System.out.println(cbuf); // 이 방식으로 진행하면, 한 배열에 5개씩 출력하기 때문에
                // |하이 자바| | 만나서 | |반갑다서 |
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("text2.txt not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File corrupt");
        }
    }

    public static void m3() {
        try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))) {

            int c = 0;
            while ((c = br.read()) != -1) {     // != means "not equal"
                System.out.println((char) c);

            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void m4() {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("text4.txt"));
            bw = new BufferedWriter(new FileWriter("text4-1.txt"));

            char[] cbuf = new char[5];
            int readCount = 0;

            while ((readCount = br.read(cbuf)) != -1) {
                bw.write(cbuf, 0, readCount);
                System.out.println(readCount);

             //   for (int i = 0; i < readCount; i++) {
             //       System.out.print(cbuf[i]);
             //   }
            }



            if (readCount == -1) {
                System.out.println("\ntext4-1.txt has been created");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("file error");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //     m1();
        //    m2();
        //    m3();
        m4();
    }

}
