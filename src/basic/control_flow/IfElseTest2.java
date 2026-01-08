package basic.control_flow;

import java.util.Scanner;

public class IfElseTest2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("성적을 입력학세요 : ");
    int score = sc.nextInt();
    //단 점수가 0~100 사이값으로 입력받는다
    if(score>=0 && score<=100) {
      if (score < 80) {
        System.out.println("불합격");
      } else if (score >= 90) {
        System.out.println("A반");
      } else if (score >= 85) {
        System.out.println("B반");
      } else {
        System.out.println("C반");
      }
    }else {
      System.out.println(" 점수 범위가 아닙니다 ");
    }
  }
}

