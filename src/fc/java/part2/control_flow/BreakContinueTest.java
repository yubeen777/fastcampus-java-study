package fc.java.part2.control_flow;

public class BreakContinueTest {
  public static void main(String[] args) {
//    //Q.char[] c = {'s','h','u','t','d','o','w','n'}; 이 배열의 값을 출력 중 'o'라는 문자를 만나면 반복을 중지하세오
    char[] c = {'s','h','u','t','d','o','w','n'};
    for(int i=0;i<c.length;i++){
      if(c[i]=='o'){
        break;
      }
        System.out.println(c[i]);
    }
    //Q.1~10까지의 수 중 3의 배수의 개수를 구하여 출력하시오
    int count = 0;
    for(int i=1; i<=10;i++){
      if(i%3==0) continue;
        count++;
    }
    System.out.println("count = " + count);




    int sum = 0;
    for(int i=1; i<=10;i++){
      sum=sum+i;
      // sum+=i;
    }
    System.out.println(sum);
  }
}
