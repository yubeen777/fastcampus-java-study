package fc.java.course2.model2;

//이게 기본적으로 잘 설계된 DTO,VO이다.

public class BookDTO {
  //멤버변수 , 상태 정보 , 속성
  private String title;
  private int price;
  private String company;
  private String author;

  public BookDTO() {
  }//디폴트 생성자

  public BookDTO(String title, String author, String company, int price) {
    this.title = title;
    this.author = author;
    this.company = company;
    this.price = price;
  }// 생성자 메서드이 중복정의(Overloading)

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "BookDTO{" +
        "title='" + title + '\'' +
        ", price=" + price +
        ", company='" + company + '\'' +
        ", author='" + author + '\'' +
        '}';
  }//object가 기본 부모 클래스인데 기본적으로 생략이 되어있고 toString()메서드를여기서 재정의 오버라이드 한것이다
}
