package basic.string_char;

public class FindAPI {
  public static void main(String[] args) {
    int a; //이건 기본적으로 주는 자료형인데
    /*String는 라이브러리에서 가져온거다 하지만 원래는 어디서 가져왔는지 작성이 되이있어야 하는데
    예를들어 java.lang.String이렇게 어디에 있는건지 찾아오는거다
     */
    a=10;
    System.out.println("a = " + a);
    String s ;
    s = "Apple";
    System.out.println("s = " + s);
    System.out.println(s.length());//s는 즉 String자료형의 변수인데
    // 크게 String은 클래스이고 그안에 다양한 기능이 있는데
    //그 기능을 사용하려면 s. 뒤에 .을 붙이면 사용가능한 메서드가 나오고 그중 저 메서드는   길이를 알려주는 기능을 한다
  }
}
