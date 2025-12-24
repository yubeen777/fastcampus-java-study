package basic.object_part;

public class BookExam {
  public static void main(String[] args) {
    // 정수 1개를 저장할 [변수를 선언] 하시오
    int a = 10;
    // 책 한군을 저장할 변수를 선언하시오
    Book b ;
    // 한권으 책 데이터를 저장하기 위해서 객체를 생성하시오.(인스턴스를 만드시오)
    b = new Book();
    b.title = "<UNK>";
    b.author = "<UNK>";
    b.company = "<UNK>";
    b.price = 30000;
    b.isbn = "<UNK>";
    b.page = 700;
    System.out.println(b.title + " " + b.author + " " + b.price + " " + b.isbn + " " + b.page + " "  + b.company);
  }
}
