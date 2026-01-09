package fc.java.part2.method;

import java.util.Scanner;

public class MethodMakeTest {
  public static void main(String[] args) {
     //Q.매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하시오
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력해 주세여 :");
    int n = sc.nextInt();
    System.out.print("정수를 입력해 주세여 :");
    int m = sc.nextInt();
    System.out.println("합계 :"+add(n,m));


  }

  public static int add(int n, int m) {
   int sum = n+m;
   return sum;
  }
}
/*
밑에는 Static을 쓰지 않고 했을 경우
import java.util.Scanner;

public class basic.method.MethodMakeTest {
  public static void main(String[] args) {
    //Q.매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하시오
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력해 주세여 :");
    int n = sc.nextInt();
    System.out.print("정수를 입력해 주세여 :");
    int m = sc.nextInt();

    basic.method.MethodMakeTest obj = new basic.method.MethodMakeTest();
    System.out.println("합계 :"+ obj.add(n,m));


  }

  public  int add(int n, int m) {
    int sum = n+m;
    return sum;
  }
}

void 메서드는 반환값이 없기 때문에
add(n, m)을 변수에 대입하거나 출력에 사용할 수 없다.
또한 void 메서드에서는 return sum;과 같이
값을 반환하는 return 문을 사용할 수 없다.

*/