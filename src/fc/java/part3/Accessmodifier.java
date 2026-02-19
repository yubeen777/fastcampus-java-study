package fc.java.part3;

import fc.java.model.MemberDTO;

public class Accessmodifier {
  public static void main(String[] args) {
    MemberDTO dto = new MemberDTO();
    dto.name = "홍길동";
    //dto.age = 1000;// 에러 접근
    dto.phone = "010-1111-2222";

  }

}

