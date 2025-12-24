package basic.datatype;

public class BinaryExam {
  public static void main(String[] args) {
    //Q. 123을 10진수 ,2진수,8진수,16진수로 출력하시요
//    int decimal = 123;
//    int binary = 0b01111011;
//    int octal = 0173;
//    int hexa = 0x7B;
//    System.out.println("decimal = " + decimal);
//    System.out.println("binary = " + binary);
//    System.out.println("octal = " + octal);
//    System.out.println("hexa = " + hexa);
    //이건 매서드를 이용해 작 진수를 구하는 방법이다
    int data = 123;
    String binary = Integer.toBinaryString(data);
    System.out.println("binary = " + binary);
    String octal = Integer.toOctalString(data);
    System.out.println("octal = " + octal);
    String hex = Integer.toHexString(data);
    System.out.println("hex = " + hex);
  }
}
