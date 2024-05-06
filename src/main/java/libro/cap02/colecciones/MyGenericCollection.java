package libro.cap02.colecciones;

public class MyGenericCollection<T> {
  private Object[] data = null;
  private int len = 0;

  public MyGenericCollection(int initialCapacity) {
    data = new Object[initialCapacity];
  }

  public void add(T element) {
    insert(element, len);
  }

  public void insert(T element, int position) {
    if(len == data.length) {
      Object[] aux = data;
      data = new Object[data.length * 2];

      for(int j = 0; j < len; j++) {
        data[j] = aux[j];
      }
      aux = null;
    }

    for (int j = len - 1; j >= position; j--) {
      data[j + 1] = data[j];
    }
    data[position] = element;
    len++;
  }

  public int search(T element) {
    int i = 0;

    for(; i < len && !data[i].equals(element); i++);
    return i < len ? i : -1;
  }

  @SuppressWarnings("unchecked")
  public T delete(int position) {
    Object aux = data[position];

    for(int j = position; j < len - 1; j++) {
      data[j] = data[j + 1];
    }
    len--;
    return (T) aux;
  }

  @SuppressWarnings("unchecked")
  public T get(int position) {
    return (T) data[position];
  }

  public int quantity() {
    return len;
  }

}
