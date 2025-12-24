package basic.syntax;

public class CarTest {
  public static void main(String[] args) {
    //자동차의 정보를 저장하려고 한다 변수를 만들어 보자
    String model="BMW528i";
    System.out.println("model = " + model);//soutv를 하면 일일히 타이핑을 하지 않고 왼쪽같은 타이핑이 되어나온다
    String company="BMW";
    System.out.println("company = " + company);
    int distance=100000;
    System.out.println("distance  = " + distance + "Km");
    //int는 4byte가 최대치 즉 21부터 -21이내 수만 저장 가능 4byte는 2의 32제곱이고 1byte는 8bit이다
    //즉 4byte는 32bit
    long price=10000000000L; //int수치를 넘어서면 long로 표현해야한다 뒤에  붙이는건 잊지 말기!
    System.out.println("price = " + price);
    char type='A';//단일 문자일때는 ''로 표현하고 자료형은 char이다
    System.out.println("type = " + type + "Type");
    boolean auto = true;
    System.out.println("auto = " + auto);
    int year=2010;
    System.out.println("year = " + year);
    float gasmi = 12.3f;//
    System.out.println("gasmi = " + gasmi + "l");



  }
}
/* 이렇게 자동타 정보를 저장하기 위해 8개 이상의 독립적인 변수가 사용 되었는데 바람직한 방법이 아니라 생각 된다
이에 해결방법이 있을까?? */