package fc.java.course1.part3.VO_Calss;

import fc.java.course1.model.PersonVO;

public class SetterGetterTest {
  public static void main(String[] args) {
    PersonVO vo = new PersonVO();
    vo.setName("유빈");
    vo.setAge(26);
    vo.setPhone("010-111-222");
    System.out.println(vo.getName() + "\t" + vo.getAge() +"\t"+ vo.getPhone());

  }
}
