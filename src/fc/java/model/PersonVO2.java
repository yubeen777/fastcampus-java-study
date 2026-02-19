package fc.java.model;

//이건 생성자 만들어서 초기화 하는 방법
public class PersonVO2 {
  private String name;
  private int age;
  private String phone;

public PersonVO2(){
//  this.name = "홍길동";
//  this.age = 26;
//  this.phone = "010-1111-2522";
}

public PersonVO2(String name , int age , String phone){
  this.name = name;
  this.age = age;
  this.phone = phone;

}


  //setter method 위처럼 하면 이거 없어도 됨
//  public void setName(String name){
//    this.name = name;
//  }
//  public void setAge(int age){
//    this.age = age;
//  }
//  public void setPhone(String phone) {
//    this.phone = phone;
//  }

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


  //스트링 메서드로 한번에 출력하기
  public String toString(){
  return this.name + " " + this.age + " " + this.phone;
  }
}
