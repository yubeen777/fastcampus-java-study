package basic.control_flow;

public class WhileTest {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int i = 0;
    while (i < numbers.length) {
      System.out.println("numbers = " + numbers[i]);
      i++;
      }
    System.out.println("지금 i 는 " + i + " 이여서 조건식에 부합하여 While문에서 나왔습니다");



    int x = 1;
    while(x <= 10){
      System.out.println("x = " + x);
      x++;
    }


    int e =1;
    do {
      System.out.println("e = " + e);
      e++;
    }while(e<=10);
  }
}
