package basic.array;

import basic.object.Book;

public class BasicArrayTest {
  public static void main(String[] args) {

    // 1. 실수 3개를 저장하는 기본 배열
    float[] f = {24.5f, 45.6f, 77.65f};

    System.out.println(f[0]);
    System.out.println(f[1]);
    System.out.println(f[2]);

    // 2. 책 3권을 저장하는 객체 배열
    Book[] b = new Book[3];

    // b[0]
    b[0] = new Book();
    b[0].title = "자바";
    b[0].price = 30000;
    b[0].company = "한빛";
    b[0].author = "박민영";
    b[0].page = 500;
    b[0].isbn = "11889900";

    // b[1]
    b[1] = new Book();
    b[1].title = "파이썬";
    b[1].price = 28000;
    b[1].company = "이지스";
    b[1].author = "김철수";
    b[1].page = 450;
    b[1].isbn = "22990011";

    // b[2]
    b[2] = new Book();
    b[2].title = "C언어";
    b[2].price = 25000;
    b[2].company = "길벗";
    b[2].author = "이영희";
    b[2].page = 400;
    b[2].isbn = "33778899";

    // 출력
    for (int i = 0; i < b.length; i++) {
      System.out.println(
          b[i].title + "\t" +
              b[i].price + "\t" +
              b[i].company + "\t" +
              b[i].author + "\t" +
              b[i].page + "\t" +
              b[i].isbn
      );//   이렇게 하는게 더 효율적 밑에 처럼 하면 일일히 다써줘야함
      /* System.out.println( b[0].title + "\t" +b[0].price + "\t" + b[0].company + "\t" + b[0].author + "\t" + b[0].page + "\t" + b[0].isbn
        );*/
    }
  }
}

