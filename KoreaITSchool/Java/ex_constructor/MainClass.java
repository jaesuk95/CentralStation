package ex_constructor;

public class MainClass {

// The sole purpose of the constructor is to initialize the data fields of objects in the class.

// A constructor in Java is a block of code similar to a method that's called when an
// instance of an object is created. Unlike methods, constructors are not considered
// members of a class. A constructor is called automatically when a new instance of an
// object is created.

// Constructor is used to initialising objects of a class and allocate appropriate memory to objects.

    public static void main(String[] args) {

        Member member = new Member("google","alphabet");

        member.printThis();

    }
    // constructor
    /*
     * 1. 객체를 생설할 때 (new) 자동으로 호출된다
     * 2. 객체를 만드는 메소드이다.
     * 3. 반환타입이 없다.
     * 4. 메소드명이 클래스명과 같다.
     * 5. 생성자는 반드시 필요하기 때문에 만들지 않으면 자동으로 만들어 진다.
     *     : default 생성자 (밑에 예시)
     *
     * 		public Member() {
     *
     * 		}
     */
}
