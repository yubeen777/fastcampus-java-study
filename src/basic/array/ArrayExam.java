package basic.array;

public class ArrayExam {
  public static void main(String[] args) {

    // 대문자로 이루어진 char 배열 선언 및 초기화
    char[] c = {'A','P','P','L','E'};

    // 배열의 모든 요소를 순서대로 처리하기 위한 반복문
    for (int i = 0; i < c.length; i++) {

      /*
       * [방법 1] Character 클래스 사용
       * - char는 기본 자료형이라 메서드를 가질 수 없음
       * - toLowerCase()는 String 메서드이므로 char에는 직접 사용 불가
       * - Character 클래스의 static 메서드를 사용하여 변환
       */
      System.out.print(Character.toLowerCase(c[i]));

      /*
       * [방법 2] 아스키 코드 이용
       * - 대문자 'A'~'Z'는 아스키 코드 65~90
       * - 소문자 'a'~'z'는 아스키 코드 97~122
       * - 대문자 → 소문자 변환 시 +32
       * - 연산 결과는 int이므로 char로 캐스팅 필요
       */
      System.out.print((char)(c[i] + 32));
    }
  }
}
