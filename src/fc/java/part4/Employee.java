package fc.java.part4;
//사원 DTO.VO

public class Employee {
//  protected String name;
//  protected int age;
//  protected String phone;
//  protected String empDate;
//  protected String dept;
//  protected boolean marriage;

  private String name;
  private int age;
  private String phone;
  private String empDate;
  private String dept;
  private boolean marriage;

  public Employee(){
    super();//상위클래스이 생성자를 호출 ->
  }


//여기서 초기화를 시켜서 자식 클래스에 넘겨주멵 정보은닉 그리고 자식 클래스로 인한
// 부모 클래스의 데이터 변경이 일어나 일관성 무결성이 저해 되는 일을 막을 수 있다
  public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.empDate = empDate;
    this.dept = dept;
    this.marriage = marriage;
  }

//toStrig()

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", empDate='" + empDate + '\'' +
        ", dept='" + dept + '\'' +
        ", marriage=" + marriage +
        '}';
  }
}
