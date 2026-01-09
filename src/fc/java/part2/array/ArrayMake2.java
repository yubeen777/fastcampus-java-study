package fc.java.part2.array;

public class ArrayMake2 {
  public static void main(String[] args){
    //Q. 정수5개를 저장할 배열을 생성하시요
    int[] a=new int[5];
//    a[0] = 10;
//    a[1] = 10;
//    a[2] = 10;
//    a[3] = 10;
//    a[4] = 10;
//    System.out.println(a[0]);
//    System.out.println(a[1]);
//    System.out.println(a[2]);
//    System.out.println(a[3]);
//    System.out.println(a[4]);
    //근데 이런식은 코드도 길고 의미가 없음 필요없고 그래서 반복문을 이용
    for (int i =0 ; i<a.length ;i++ ){
      a[i] =10;
      System.out.println(a[i]);
    }

  }
}
