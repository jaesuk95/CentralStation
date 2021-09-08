package ex_exception;

public class MainClass {
    public static void main(String[] args) {

        //		1. NullPointerException
        //		String name = null;
        //		name.equals("나다");

        //		2. NumberFormatException
        //		Integer.parseInt("1.5");	// 문자열 "1.5" 을 정수로 변환

        //		3. ArrayIndexOutOfBoundsException
        //		int[] arr = new int[3];
        //		arr[100] = 10;

        //		4. ArithmeticException
        //		System.out.println(4 / 0);

        NullPointerException e1 = new NullPointerException();
        NumberFormatException e2 = new NumberFormatException();

        System.out.println(e1);
        System.out.println(e2);


    }
}
