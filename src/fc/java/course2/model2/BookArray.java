package fc.java.course2.model2;

import java.util.Arrays;

public class BookArray {

  private static final int DEFAULT_CAPACITY = 5;
  private BookDTO[] books;
  private int size = 0;

  public BookArray() {
    books = new BookDTO[DEFAULT_CAPACITY];
  }

  public int size() {
    return size;
  }

  public int length() {
    return books.length;
  }

  public void add(BookDTO data) {
    if (size == books.length) {
      ensureCapacity();
    }
    books[size++] = data;
  }

  public BookDTO get(int index){
    if (index < 0 || index >= size){
      throw new RuntimeException("Index out of bounds");
    }
    return books[index];
  }

  private void ensureCapacity(){
    int newSize = books.length * 2;
    books = Arrays.copyOf(books, newSize);
  }
}