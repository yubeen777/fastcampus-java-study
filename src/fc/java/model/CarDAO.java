package fc.java.model;

public class CarDAO {
  //C.R.U.D
  //Creat = insert(저장)
  public void carInsert(CarDTO car) {
    //DB연결, insert SQL
    System.out.println(" car 정보가 DB에 저장 되었습니다");
  }

  //DB에 연결 안됨아직 그냥 로직 설명을 위해 DAO가 뭔지를 설명하기 위해 만든거다
  public void carSelect() {
    System.out.println("car 정보가 출력이 되었습니다 ");
  }
}
