package basic.control_flow;

import java.util.Scanner;

public class IfbasicTest {
  public static void main(String[] args) {
    //Q. x의 값이 0 보다 큰 경우에만 "양수 입니다" 출력
   int x=-4;
    if (x>0) {
      System.out.println(" 양수입니다 ");

    }else  {
      System.out.println(" 음수입니다");
    }

    //Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하시오
    int y = 14;
    if (y%7 == 0) {
      System.out.println("7의 배수입니다 ");
    }else {
      System.out.println("이건 아니야 이눔아!");
    }
    //------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    System.out.print(" 정수를 입력하세요 : ");
    int num = sc.nextInt();
    if (num%7 == 0){
      System.out.println( num + "은7의 배수 입니다");
    }else {
      System.out.println(num + "가 7의 배수일리가...없자나.... ");
    }


    //Q.나이를 입력받아 19세 이상이면 성인임을 출력하는 코드를 작성하시오
    System.out.print(" 나이를 입력하세요 : " );
    int age = sc.nextInt();
    if(age>=19){
      System.out.println(age + "세는 성인 입니다");
    }

  }
}
