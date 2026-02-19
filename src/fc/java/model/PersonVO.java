package fc.java.model;

public class PersonVO {
  private String name;
  private int age;
  private String phone;

  /* 원래 여기에 디폴트로 생성자를 만들지 않으면
  public PersonVO() {
  } -> 이게 자동으로 만들어진다
  그래서 나중에 new personVO() 이게 가능한거다
  ❗ 하지만 생성자를 하나라도 직접 작성하면
   → 기본 생성자는 자동 생성되지 않는다
*/

  //setter method
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  //getter method
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getPhone(){
    return this.phone;
  }
}
