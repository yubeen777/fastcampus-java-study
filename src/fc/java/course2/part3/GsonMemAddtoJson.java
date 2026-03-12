package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonMemAddtoJson {
  public static void main(String[] args) {
    Address address = new Address("서울","대한민국");
    Person p = new Person("홍길동",100,"bit@naver.com",address);
    Gson gson = new Gson();
    String json = gson.toJson(p);
    System.out.println(json);

  }
}
