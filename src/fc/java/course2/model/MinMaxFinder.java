package fc.java.course2.model;

public class MinMaxFinder {

  public  int[] findMinMax(int[] arr) {

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {

      if (arr[i] < min) {
        min = arr[i];
      }

      if (arr[i] > max) {
        max = arr[i];
      }
    }
//int
    return new int[]{min, max};
  }
}