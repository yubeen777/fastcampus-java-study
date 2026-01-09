package fc.java.part2.control_flow;

public class LoopLoopTest {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      System.out.print(i + "단" + "\t\t");
    }
    System.out.println();

    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + "*" + i + "=" + (i * j) + "\t");

      }
      System.out.println();
    }



    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j <= 2; j++) {
          System.out.print( a[i][j] + "\t");
      }
      System.out.println();
    }
    /*위를 좀더 다듬도 정확하게 정교하게 다듬으면
      for(int i = 0 ; i <a.lentgh ; i++){
      for(int j = 0; j < a[i].length ; j++){
        System.out.printin( a [i][j]);

        }
        System.out.printin()
      }
*/





    /*위에것은 2차원인데 3차원은 다르게 생겼다
           int[][][] a = {
          {
              {1, 2, 3},
              {4, 5, 6}
          },
          {
              {7, 8, 9},
              {10, 11, 12}
          }
      };

      for (int i = 0; i < a.length; i++) {          // 면
    for (int j = 0; j < a[i].length; j++) {   // 행
        for (int k = 0; k < a[i][j].length; k++) { // 열
            System.out.println(a[i][j][k]);
        }
    }
}

*/

  }
}
