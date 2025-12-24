package basic.syntax;

//클래스 단위로 코딩을 한다.
// 시작,메인 클래스
//JavaSE프로그램은 main이 기본값이다
public class Calculator {
  //main() {} 메서드
  public static void main(String[] args) {
    //Q.두 개의 정수를 더하여 자바 프로그햄을 만들어 보자
    int a, b, sum;

    a = 10;
    b = 20;
    sum = a + b;
    //출력 단축 단어:sout
    System.out.println(sum);   // 30
  }
}



