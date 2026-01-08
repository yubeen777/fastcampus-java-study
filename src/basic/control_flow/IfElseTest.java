package basic.control_flow;

import java.util.Scanner;

public class IfElseTest {
  public static void main(String[] args) {
    int x = 10;
    if(x>=0){
      System.out.println(" 0 or 양수 입니다 ");
    }else {
      System.out.println(" 음수입니다 ");
    }

     // Q 정수 1개를 입력받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요:");
    int num = sc.nextInt();
    if (num%2==0){
      System.out.println(num + "은(는) 짝수 입니다 ");
    }else  {
      System.out.println(num + "은(는) 홀수 입니다");
    }


    // Q 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요

    System.out.print("정수를 입력하세요:");
    int num1 = sc.nextInt();
    if (num1%12==0){
      System.out.println(num1 + "은(는) 12의 배수 입니다 ");
    }else  {
      System.out.println(num1 + "은(는) 12배수가 아닙니다");
    }

    // Q.년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하세요
    System.out.print("년도를 입력하세요:");
    int num2 = sc.nextInt();
    if ( (num2 % 4 == 0 && num2 % 100 != 0) || num2 % 400 == 0){
      System.out.println(num2 + "년은 윤년 입니다 ");
    }else  {
      System.out.println(num2 + "년은 윤년이 아닙니다");
    }
  }
}
