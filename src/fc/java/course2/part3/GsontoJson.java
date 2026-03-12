package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsontoJson {
  public static void main(String[] args) {
    Member m = new Member("홍길동",30,"bit@empas.com");
    Gson gson = new Gson();
    String json = gson.toJson(m);
    System.out.println("json = " + json);
  }
}
