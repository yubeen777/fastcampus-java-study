package basic.charstring;

public class CharExam {
  public static void main(String[] args) {
    //Q. '1'+'2'+'3'+'4'+'5'=15가 나오도록 프로그래밍 하시오
      int a = '1';
      int b = '2';
      int c = '3';
      int d = '4';
      int e = '5';
//    int sum = (a + b + c + d + e) - 240;
//    System.out.println("'1'+'2'+'3'+'4'+'5'=" + sum );
  //의 방법은 야매 ㅋㅋ
        int sum = (a- '0') + (b- '0') + (c- '0') + (d- '0') + (e- '0') ;
        System.out.println("'1'+'2'+'3'+'4'+'5'=" + sum);
//  -----------------------------------------------------
  //혹은 다른 방법이 있다
  /*
  int sum = '0';
  sum = sum + ('1'-'0');
  sum = sum + ('2'-'0');
  sum = sum + ('3'-'0');
  sum = sum + ('4'-'0');
  sum = sum + ('5'-'0');
  System.out.println("sum =" + sum );
  */
  }
}
