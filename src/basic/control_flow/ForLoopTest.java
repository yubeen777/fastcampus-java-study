package basic.control_flow;

public class ForLoopTest {
  public static void main(String[] args) {
    //Q . 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하세요
    for (char i = 'A'; i <= 'Z'; i++){
      System.out.println(i + "=" + (int)i);

    }
    //Q. int[]numbers ={1,2,3,4,5,6,7,8,9,10}; 배열원소릉 향상된 for문으로 출력하시오
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for( int n : numbers ){
      System.out.println("n = " + n);
    } // 괄호 안에 변수 설정 그리고 배열 혹은 컬렉션을 넣는다


  }
}
