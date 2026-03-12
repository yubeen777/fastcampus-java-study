package fc.java.course2.model2;

import java.util.Arrays;

public class ObjectArray {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elements;//다형성 배열
  private int size = 0;

  public ObjectArray() {
    elements = new Object[DEFAULT_CAPACITY];//5개 크기의 배열 생성자
  }

  public ObjectArray(int Capacity) {
    elements = new Object[Capacity];
  }//오버로딩을 통해 원하는 배열 크기를 생성한다

  public int size() {
    return size;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("범위초과");
    }
    return elements[index];
  }

  public void add(Object element) {
    if (size == elements.length) {
      ensureCapacity();
    }
    elements[size++] = element;
  }

  private void ensureCapacity() {
    int newCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, newCapacity);
  }
}