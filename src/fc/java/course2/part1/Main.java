package fc.java.course2.part1;

import fc.java.course2.model.MinMaxFinder;

public class Main {
  public static void main(String[] args) {

    MinMaxFinder f = new MinMaxFinder();

    int[] numbers = {10, 3, 25, 7, 1, 18};

    int[] result = f.findMinMax(numbers);

    System.out.println("최소값: " + result[0]);
    System.out.println("최대값: " + result[1]);
  }
}