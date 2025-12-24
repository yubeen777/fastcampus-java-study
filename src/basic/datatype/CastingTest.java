package basic.datatype;

public class CastingTest {
  public static void main(String[] args) {
    float f1= .10f;
    float f2= 15f;// 각 예시는 float는 실수 자료형이기에 저렇게 값을 입력해도 알아서 출력이 된다
    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    float f3= 3.14f;
    // float f3 = (float)3.14이렇게 해도 됨 강제 형 맞춤
    // 3.14만 입력하면 기본적으로 double로 인식하기에 오류 남
    System.out.println("f3 = " + f3);
    double d1= 123.45678;
    System.out.println("d1 = " + d1);

    float x = 15.6f;
    int y = (int)x;// 강제형변환(손실)
    System.out.println("y = " + y);

    char c = 'A';
    int cc = c;//자동형변환
    System.out.println("cc = " + cc);

    int dd = 5;
    double ddd = dd;
    System.out.println("dd = " + dd);

    double dx = 14.67;
    int dy = (int)dx;
    System.out.println("dy = " + dy);

  }
}
