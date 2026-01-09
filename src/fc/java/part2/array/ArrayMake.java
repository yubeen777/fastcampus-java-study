package fc.java.part2.array;

import fc.java.part2.object.Book;

public class ArrayMake {
  public static void main(String[] args) {
    //정수 5개를 저장할 배열을 생성하시오
    int[] a = new int[5];
   // int[] a;
    //a = new int[5]
    float[] f = new float[5]; // 길이가 고정

    Book b1,b2,b3;// 클래스를 배열화 시킬때는 이 참조변수는 필요없음 즉 이렇게 변수 선언 안해도 됨
    Book[] b =new Book[3];// 책 3권을 저장할 배열 생성
    b[0] = new Book();//객체배열인데 일반 배열과 다르게배 열에 값을 넣는 방식은 이렇게 각 인덱스에 맞는 객체를 생성해 줘야만 가능하다
    b[1] = new Book();
    b[2] = new Book();
  }
}
