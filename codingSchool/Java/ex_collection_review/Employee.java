package ex_collection_review;

public class Employee {

    private String name;
    private Long id;

    public Employee(String name, Long id) {     // 객체를 새로 생성할때 쓰여진다. eg. employs.add(new Employee(name, id));
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {      // toString() 쓰는 이유는, returns a textual representation of the object. replaces memory location to string information
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {       // getter 와 setter 는 객체를 부를때 사용된다 eg. delete id 그리고 사원 조회 (get information)
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
