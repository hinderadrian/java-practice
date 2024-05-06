package libro.cap02.colecciones;

public class MyStack<T> {

  private static final int initialCapacity = 5;

  private MyGenericCollection<T> collection = new MyGenericCollection<>(initialCapacity);

  public void stackItem(T item) {
    collection.insert(item, 0);
  }

  public T unstackItem() {
    return collection.delete(0);
  }

}
