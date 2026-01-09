package fc.java.part2.method;

public class CallByReference {
  public static void main(String[] args) {

    float a = 3.5f;
    float b = 4.5f;

    // ▶ 메서드 호출
    // 이 호출의 목적은 "결과를 받는 것"이 아니라
    // 메서드 내부에서 계산한 값을 "출력하는 것"
    // 그래서 반환값을 받는 변수도 없음
    floatAdd(a, b);
  }

  // Q. 매개변수로 2개의 실수를 받아서
  //    총합을 구하여
  //    출력하는 메서드 정의

  // ▶ 반환값이 필요 없는 메서드이므로 void 사용
  // ▶ 이 메서드는 "계산 + 출력"까지만 책임진다
  public static void floatAdd(float a, float b) {

    // a, b는 main에서 전달된 값의 복사본
    // (Call By Value)
    float c = a + b;

    // ▶ 출력이 목적이므로 System.out.println 사용
    // 메서드를 호출하는 순간 바로 실행됨
    System.out.println(c);

    // ▶ return이 없는 이유
    // - 결과를 main으로 돌려줄 필요가 없음
    // - 출력만 하면 역할이 끝남
    // - void 메서드이므로 값 있는 return 사용 불가

    // return;  // (선택 사항)
    // void 메서드에서도 return; 은 "메서드 종료" 의미로만 사용 가능
    // 지금은 메서드 끝이라 생략해도 동일
  }
}
