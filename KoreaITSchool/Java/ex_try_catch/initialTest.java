package ex_try_catch;

public class initialTest {
    public static void m1() {
        try {
            String name = "Jaesuk";
            name.equals("이재석");
            String age = "";
            Integer.parseInt(age);
        } catch (NullPointerException e) {
            System.out.println("이름이 필요합니다");
        } catch (NumberFormatException e) {
            System.out.println("나이가 필요합니다");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다");
        }
    }
}
