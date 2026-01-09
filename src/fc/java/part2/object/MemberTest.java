package fc.java.part2.object;

public class MemberTest {
  public static void main(String[] args) {
    // Q. 한명의 헬스클럽 회원 데이터를 저장하고 출력하시오
    Member m =  new Member();
    m.name = "홍길동";
    m.age = 20;
    m.address = "Seoul";
    m.tel = "010-1111-2222";
    m.email = "<UNK>";
    System.out.println(m.name+" "+m.age+" "+m.address+" "+m.tel+" "+m.email);
  }
}
