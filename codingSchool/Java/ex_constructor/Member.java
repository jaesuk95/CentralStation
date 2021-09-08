package ex_constructor;

public class Member {

    private String user;
    private String password;

    public Member(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Member() {

    }

    public void printThis() {
        System.out.println("아이디는 : " + user);
        System.out.println("Password is : " + password);
    }

}
