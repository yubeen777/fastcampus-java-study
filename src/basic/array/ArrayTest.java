package basic.array;

public class ArrayTest {
  public static void main(String[] args) {
    //Q.실수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하고 출력하세요
    float[] f = new float[5];
    for(int i=0 ;i<5 ;i++ ){
      f[i] = 10.5f;
      System.out.println(f[i]);}
      //Q.정수 5개를 아랯처럼 배열에 초기화 하고 index 0번째와 index 3번째 값을 더하여 출력하시오
      int[] a = {10,20,30,40,50};
      int sum = a[0] + a[3];
      System.out.println(sum);
    System.out.println(a.length);

    int[] b = new  int[5];
    System.out.println(b[0]);
    System.out.println(b[1]);
    System.out.println(b[2]);
    System.out.println(b[3]);
    System.out.println(b[4]);
    //이렇게 값을 안넣고 하면 기본갑은 0 으로 해준다 float일때는 0.0이 기본값이다

  }
}
