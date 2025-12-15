package Basic문법;

public class CharTest {
  public static void main(String[] args) {
    char c = 'A';
    System.out.println("c = " + c);  // A
    int a =  'A';
    System.out.println("a = " + a);
    int b =  'B' + 1;
    System.out.println("b = " + (char)b);
    //Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오.
    char han = '가';
    System.out.println("han = " + han);

    int hanD='가';
    System.out.println("hanD = " + hanD);

    int hanU = '\uAC00';
    System.out.println("hanU = " + hanU);
    int hanU1 = '\uAC00';
    System.out.println("hanU = " + (char)hanU1);//형 변환
    //Q. 대문자 'A'를 문자  'a'로 변환하여 출력하시오(ASCII코드 참고)
    char Big = 'A';
    int Small = 'A' +32;
    System.out.println("Big = " + Big);
    System.out.println("Small = " + (char)Small);

    char Upper = 'A';
    char Lower =  (char)(Upper + 32) ;
    /*int Lower = Upper + 32는 오류 안남 근데 char Lower = Upper + 32;는 오류남
    이유는
    */

    char Lower1 = 'u';
    int Upper1 = Lower1 - 32;
    System.out.println("Upper1 = " + Upper1);
    //여기서 문자로 나오게 하고 싶으면
    System.out.println("Upper1 = " + (char)Upper1);


/*문제:'1' + '2' = 3 이 나오도록 프로그래밍 하시오
---------------------------------------------*/
char x = '1';
char y = '2';
/* 방법 1) 바로 계산해서 출력
 System.out.println("'1'+'2'=" + ((x - '0') + (y - '0')));
 → (49-48) + (50-48) = 3
 → int 계산 결과를 바로 출력*/

// 방법 2) 변수로 받아서 출력 (가장 일반적이고 명확)
int sum = (x - '0') + (y - '0');
System.out.println("'1'+'2'=" + sum);

//=================================================
// 아래는 추가 개념 정리

// a) char로 바로 받는 경우
// char sum = (char)((x - '0') + (y - '0'));
// → 실제 값은 3이 맞지만
// → char는 숫자가 아니라 문자 코드로 해석됨
// → (char)3 은 ASCII 코드 3 (ETX, 제어 문자)
// → 화면에 보이는 출력이 없음 또는 의미 없는 출력

// b) 문자 '3'을 의도한 경우
// char sum = (char)((x - '0') + (y - '0') + '0');
// → 1 + 2 + 48 = 51
// → ASCII 51은 문자 '3'
// → 그래서 화면에 3 이 보임
// 즉  '3' 이 위 결과 숫자 3처럼 출력값에는 똑같이 나와서 헷갈릴 수 있음

// 정리:
// int로 받으면 "계산 결과 숫자 3"
// char로 받으면 "문자 코드로 해석된 값"
// char (ASCII 3) 은 출력 불가 제어 문자
// char (ASCII 51) 은 출력 가능한 문자 '3'

// 결론:
// 계산 결과를 쓰려면 int
// 화면에 문자로 보여주려면 char (+ '0')


  }
}
