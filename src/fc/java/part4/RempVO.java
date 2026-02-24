package fc.java.part4;

public class RempVO extends Employee{
  public RempVO(){
    super();
  }
  public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
    //초기화 (자식이 부모의 기억 공간에 쵝호 하는 경우)protected를 쓸 경우
//    this.name=name;
//    this.age=age;
//    this.phone=phone;
//    this.empDate=empDate;
//    this.dept=dept;
//    this.marriage=marriage;
  super(name,age,phone,empDate,dept,marriage);
  }
}
