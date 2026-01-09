package fc.java.part2.object;

public class MovieTest {
  public static void main(String[] args) {
    Movie v = new Movie();
    v.title = "아바타";
    v.releaseDate = "2022.12.14";
    v.mainCharacter = "제이크 설리";
    v.genre = "Action";
    v.runtime = 192;
    v.rating = "12세";

    System.out.println(v.title + " " + v.releaseDate + " " + v.genre + " " +v.mainCharacter  + " "+ v.runtime + " " + v.rating);
  }
}
