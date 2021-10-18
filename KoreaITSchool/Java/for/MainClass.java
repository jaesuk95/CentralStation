package ex_for;

public class MainClass {

    public static void main(String[] args) {

        // multiFor examples

        // 1 2 3 4
        // 5 6 7 8

        int i, j = 0;
        int n = 1;

        for (i=0; i < 2; i++) {
            for (j=0; j < 4; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }

        System.out.println();

        // A B C D
        // E F G H
        // I J K L

        char alphabet = 65;

        for (char u = 'A'; u < 'D'; u++) {
            for (char v = 'A'; v <= 'D'; v++) {
                System.out.print((char) alphabet++ + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 01 02 03 04
        // 05 06 07 08
        // 09 10 11 12

        int n1 = 1;
        for (i = 0; i < 3; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.printf("%02d ", n1++);
            }
            System.out.println();
        }

        System.out.println();

        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *

        int x, y, z = 0;
        int row = 4;

        for (x = 0; x < row; x++) {
            for (y = x; y < row; y++ ) {
                System.out.print("  ");
            }

            for (z = 0; z <= x*2; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
