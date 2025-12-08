public class Operator {
  public static void main(String[] args) {
    int kor,eng,tot,aver;
    kor=77;
    eng=87;
    tot=kor+eng;
    aver=(kor+eng)/2;

    System.out.println("총점:"+(kor+eng));
    System.out.println("평균:"+((kor+eng)/2));
   // --------------------------------------------------------
    System.out.println("총점:"+tot);
    System.out.println("평균:"+aver);
    System.out.println("평균:"+(tot/2));///이렇게 여러 방법으로 표현이 가능하다
  }
}
