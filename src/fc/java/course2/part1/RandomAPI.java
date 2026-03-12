package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
  public static void main(String[] args) {
    Random rand = new Random();
   int[] arr  = new int[6];
   int i =0 ;
    // 6개가 채워질 때까지 반복
   while(i<6){
     int num = rand.nextInt(45) + 1 ;//1~45 사이 난수 생성
     boolean isDuplicate = false;// 이번 숫자가 중복인지 여부 (매 반복마다 초기화)

     // 이미 저장된 값들과 비교 (0 ~ i-1까지만 검사)
     for(int j=0;j<i ;j++){
       if(arr[j] == num){// 같은 값 발견하면
        isDuplicate = true; // 중복 표시
        break;// 더 검사할 필요 없으므로 반복 종료
       }
     }// 중복이 아닐 때만 배열에 저장
     if(!isDuplicate){
       arr[i++] = num;// arr[i]에 저장 후 i 증가
     }
   }
   for(int num:arr ){//arr 배열 안에 있는 값을 하나씩 꺼내서 num 변수에 담아라
     System.out.print(num + " ");//배열 값을 공백과 함께 한 줄에 출력
   }

   }
  }

