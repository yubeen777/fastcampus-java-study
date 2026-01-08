package basic.object;

public class BookTest {
  public static void main(String[] args) {

    // 정수 한 개를 저장할 변수를 선언
    int a;

    // 책의 속성들을 각각 독립적인 변수로 선언
    String title = "자바";
    int price = 30000;
    String author = "<UNK>";
    String company = "<UNK>";
    int page = 700;
    String isbn = "ISBN-111";

    /*
      현재 방식은 책 1권을 표현하는 것이 아니라
      제목, 가격, 저자, 출판사, 페이지 수, ISBN이라는
      서로 관계없는 변수 6개를 각각 선언한 상태이다.

      사람 입장에서는 한 권의 책으로 보이지만,
      자바 입장에서는 하나의 데이터(객체)가 아니라
      단순히 독립적인 변수들의 집합일 뿐이다.
     */

    System.out.println(
        title + "\n" +
            price + "\n" +
            author + "\n" +
            company + "\n" +
            page + "\n" +
            isbn
    );

    /*
      \n은 줄바꿈(엔터) 역할을 하고
      \t는 탭(tab) 역할을 한다.
      반드시 문자열 안(" ")에서 사용해야 한다.
     */

    /*
      이 방식의 가장 큰 문제점은
      다른 메서드에서 이 책 정보를 사용하려면
      title, price, author, company, page, isbn
      총 6개의 변수를 매개변수로 모두 전달해야 한다는 점이다.

      또한 책의 속성이 하나라도 추가되면
      관련된 모든 메서드의 매개변수를 수정해야 하므로
      확장성과 유지보수성이 매우 떨어지는 비효율적인 구조이다.

      이러한 문제를 해결하기 위해
      관련된 데이터를 하나로 묶는 class와 object 개념이 필요하다.
     */

  }

}
