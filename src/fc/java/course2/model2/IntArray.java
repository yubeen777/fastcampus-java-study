package fc.java.course2.model2;

import java.util.Arrays;

public class IntArray {
  private static final int DEFAULT_CAPACITY = 5;// 수정 불가 상수!
  private int[] datas  ;
  private int size = 0;


  public IntArray() {
    datas = new int[DEFAULT_CAPACITY];
  }

  public int size() {
    return size;
  }

  public int length() {
    return datas.length;
  }


  public void add(int data) {
    if (size == datas.length) {
      ensureCapacity();
    }
    datas[size++] = data;
    //datas[size] = data;
    //size++
    //이 두줄을 합친게  위 코드이다
  }


  public  int get(int index){
    if (index < 0 || index >= size){
      throw new RuntimeException("Index out of bounds");
    }
    return datas[index];
  }


  private void ensureCapacity(){
    int newSize = datas.length * 2;
    datas = Arrays.copyOf(datas, newSize);
  }
}

