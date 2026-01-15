package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
  public static void main(String[] args) {
    //Q.자동차의 정보를 키보드로부터 입력받아서 다른 메서드로 이동해야 되는 경우를 생각해보자
    Scanner sc = new Scanner(System.in);
    System.out.print("자동차 일렬 번호");
    int carSn=sc.nextInt();

    sc.nextLine();

    System.out.print("자동차 이름");
    String carName=sc.nextLine();


    System.out.print("자동차 가격");
    int carPrice=sc.nextInt();

    sc.nextLine(); //거의 인트 다음 써줘야 한다고 생각해하


    System.out.print("자동차 소유자");
    String carOwner = sc.nextLine();


    System.out.print("자동차 년식");
    int carYear=sc.nextInt();

    sc.nextLine();


    System.out.print("자동차 타입");//(G)휘발유,(D)경유
    String carType=sc.nextLine();


//    System.out.println(carSn + "\t" + carName + "\t" + carYesr + "\t" + carOwner + "\t" + carPrice + "\t" +  carType);
    //carInfoPrint(carYear, carOwner,carName,carPrice,carSn,carType);
    //이런식으로 하는건 너무 비효율적이라 자동차 데이터를 이동하기 위한 바구니가 필요하다 (DTO,VO)
    //클래스로 CarDTO,CarVO 모델을 설계
    CarDTO car = new CarDTO();
    car.carName=carName;
    car.carPrice=carPrice;
    car.carSn=carSn;
    car.carType=carType;
    car.carYear=carYear;
    car.carOwner=carOwner;

    CarDAO dao = new CarDAO();
    dao.carInsert(car);
    dao.carSelect();
  }

}
