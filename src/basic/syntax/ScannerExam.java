package basic.syntax;

import java.util.Scanner;

public class ScannerExam {
  public static void main(String[] args) {
    //도서정보 입력받기
    Scanner sc = new Scanner(System.in);
    System.out.print("제목 : ");
    String title =  sc.nextLine();
    System.out.print("title = " + title);

    System.out.print("가격 : ");
    int price =  sc.nextInt(); // 30000_\ 여기서 30000만 읽고 넘어가 엔터가 남아있어 입력칸을 받지 않고 바로 컴퍼니가 프린트 된다 그래서 블럭을 걸어줘야 한다
    System.out.print("title = " + price);


    sc.nextLine();

    System.out.print("출판사 : ");
    String compony =  sc.nextLine();
    System.out.print("compony = " + compony);

    System.out.print("저자 : ");
    String author =  sc.nextLine();
    System.out.print("author = " + author);


    System.out.print("page: ");
    int page =  sc.nextInt();// 여기도 위와 마찬가지이다
    System.out.print("page = " + page);


    sc.nextLine();


    System.out.print("ISBN : ");
    String ISBN =  sc.nextLine();
    System.out.print("ISBN = " + ISBN);

  sc.close();

  }
}

