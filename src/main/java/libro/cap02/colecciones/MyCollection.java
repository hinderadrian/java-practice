package libro.cap02.colecciones;

public class MyCollection {

  private Object data[] = null;
  private int len = 0;

  public MyCollection(int initialCapacity) {
    this.data = new Object[initialCapacity];
  }

  public static void main(String[] args) {

  }

  public Object get(int position) {
    return data[position];
  }

  public int quantity() {
    return len;
  }

  public void insert(Object element, int position) {
    if (len == data.length) {
      Object aux[] = data;
      data = new Object[data.length * 2];

      for (int j = 0; j < len; j++) {
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

  public int search(Object element) {
    int i = 0;

    for(; i < len && !data[i].equals(element); i++);

    return i < len ? i : -1;
  }

  public void add(Object element) {
    insert(element, len);
  }

  public Object delete(int position) {
    Object aux = data[position];

    for(int j = position; j < len - 1; j++) {
      data[j] = data[j + 1];
    }
    len--;
    return aux;
  }

}

