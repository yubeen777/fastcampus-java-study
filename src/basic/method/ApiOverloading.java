package basic.method;

public class ApiOverloading {
  public static void main(String[] args) {
    System.out.println(10);
    System.out.println(10.5f);
    System.out.println('A');
    System.out.println("Hello World");
    //println이건 다 똑같지만 오버로딩되어 정수를 쓰든 실수를 쓰든 문자를 쓰든 상관 없는 것이다
    ApiOverloading obj = new ApiOverloading();
    int Max = obj.Maxvalue(8, 5);
    System.out.println(Max);
    int Min = obj.Minvalue(8, 5);
    System.out.println(Min);
    //int Max = (8,5)
    //System.out.println(Max);
    //int Min = (8,5)
    //System.out.println(Min);


  }

  public int Maxvalue(int a, int b) {
    return (a > b) ? a : b;
  }
  //public static int Maxvalue(int a,int b){
  //    return (a>b)?a:b;

  public int Minvalue(int a, int b) {
    return (a < b) ? a : b;
  }
  //public static int Minvalue(int a,int b){
  // return (a<b)?a:b;
}
