package fc.java.part2.method;

public class OverLoadingTest {
  public static void main(String[] args) {

  }
  //Q.매개변수를 두개의 정수 값을 받아서 총합을 구할여 리턴하는 메서드를 정의 하세여
    public static int add(int a , int b){
    int sum = a + b;
    return sum;
    }

    //Q. 매개변수로 두개의 실수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의 하시오
    public static float add(float a,float b){
        float sum = a + b;
        return sum;

    }
}
