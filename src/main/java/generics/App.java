package generics;

class Store<T> {
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
}

class HashTable<K, V> {
  private K key;
  private V value;

  public HashTable(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "HashTable{" +
        "key=" + key +
        ", value=" + value +
        '}';
  }
}

public class App {

  public static void main(String[] args) {
    HashTable<Integer, Integer> hashTable = new HashTable<>(12, 23);

    System.out.println(hashTable);
  }
}
