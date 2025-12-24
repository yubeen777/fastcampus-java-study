package basic.datatype;

public class BinaryTest {
  public static void main(String[] args) {
    int a = 10;
    float f = 35.6f; //기본적으로 자바에서 실수형은 dubole로 인식해 그보다 작은 float를 사용할때는 젏게 명시를 해줘야 한단
    boolean b = false;
    char c = 'A';
    String s = "Hello";
    //Q. 69를 10진수,2진수,8진수,16진구로 출력하시오
    int decimal= 69;
    System.out.println("decimal = " + decimal);
    int binary=0b01000101;
    System.out.println("binary = " + binary);
    int octal =0105; //근데 자바에서 8진법은 잘 안씀
    System.out.println("octal = " + octal);
    int Hexa=0x45;
    System.out.println("Hexa = " + Hexa);


  }
}
