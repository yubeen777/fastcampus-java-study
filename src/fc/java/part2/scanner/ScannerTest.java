package fc.java.part2.scanner;

import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 : ");
    int num  = sc.nextInt(); // 블럭상태
    System.out.println("num = " + num);

    System.out.print("실수를 입력하세요 :");
    float f = sc.nextFloat();//블럭상태
    System.out.println("f = " + f);

    System.out.print("문자열을 입력하세요 : ");
    String str = sc.next();
    System.out.println("str = " + str);

    sc.nextLine();// 버퍼비우기(스트림 비우기) 이걸 안하면 윙서 쓴 문자열이 이어서 받아들여저 읽게 된다

    System.out.print("문자열을 입력하시요 : ");
    String str2 = sc.nextLine();
    System.out.println("str2 = " + str2);

    sc.close();//이거로 스트림을 끊어준거다
  }
}
