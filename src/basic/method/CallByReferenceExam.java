package basic.method;

public class CallByReferenceExam {
  public static void main(String[] args) {
    //Q. 매개변수로 정수형 배열을 박아서 배열의 총합을 구하여 리턴하는 메서드를 정의 하시오
    int[] a = {1, 2, 3, 4, 5};
    Addint(a);
  }

  public static void Addint(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int sum = 0;
      sum += a[i];
      System.out.println("sum = " + sum);
      return;
    }
  }
}
//--------------------------------------------------------------
/* 만약 void, 스테틱을 쓰지 않고 한다면?
public class basic.method.CallByReferenceExam {

  public static void main(String[] args) {
    // 정수형 배열 생성
    int[] a = {1, 2, 3, 4, 5};

    // static이 아니므로 객체 생성 필수
    basic.method.CallByReferenceExam obj = new basic.method.CallByReferenceExam();

    // return 값이 있으므로 받아서 사용
    int result = obj.addInt(a);
    System.out.println("총합 = " + result);
  }

  // ▶ static ❌, void ❌
  // ▶ 배열을 받아 총합을 계산하고 결과를 반환하는 메서드
  public int addInt(int[] a) {
    int sum = 0;                 // 누적 변수는 반드시 반복문 밖
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;                  // 반복 끝난 후 return
  }
}

 */
//--------------------------------------------------------
/*만약 static를 쓰지 않고 한다면?
public class basic.method.CallByReferenceExam {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    basic.method.CallByReferenceExam obj = new basic.method.CallByReferenceExam();
    obj.printSum(a); // 호출만 해도 출력됨
  }

  // ▶ static ❌, void ⭕
  // ▶ 출력이 목적이므로 return 필요 없음
  public void printSum(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    System.out.println("총합 = " + sum);
  }
}

*/
//--------------------------------------------------------
/*만약 void를 쓰지않고 한다면?
public class basic.method.CallByReferenceExam {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    // static 메서드 → 객체 없이 호출
    int result = addInt(a);
    System.out.println("총합 = " + result);
  }

  // ▶ static ⭕, void ❌
  // ▶ 계산 결과를 반환
  public static int addInt(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}

*/