package fc.java.course1.part3;

import fc.java.course1.model.Student;

public class StudentArrayTest {
  public static void main(String[] args) {
    Student[] std = new  Student[3];
    std[0] = new Student("홍길동", "항공운항", 20, "hong@email.com", 2024, "010-1111-1111");
    std[1] = new Student("이순신", "컴퓨터공학", 22, "lee@email.com", 2022, "010-2222-2222");
    std[2] = new Student("강감찬", "경영학과", 21, "kang@email.com", 2023, "010-3333-3333");

// 💡 팁: 한 줄씩 출력해보기
    for (int i = 0; i < std.length; i++) {
      System.out.println("학생"+i+":"+std[i]);
    }

    //다른 방법
  for(Student s: std) {
    System.out.println(s.toString());
  }
  }
}
