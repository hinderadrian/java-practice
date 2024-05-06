package generics.boundedType;

class Person implements Comparable<Person> {

  private final int age;
  private final String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int compareTo(Person otherPerson) {
    return Integer.compare(age, otherPerson.getAge());
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}


public class App {

  public static <T extends Comparable<T>> T calculateMin(T number1, T number2) {
    if (number1.compareTo(number2) < 0) {
      return number1;
    }
    return number2;
  }

  public static <T extends Number> double add(T num1, T num2) {
    return num1.doubleValue() + num2.doubleValue();
  }

  public static <T extends Comparable<T>> Number countGreaterItems(T[] items, T item) {
    int counter = 0;
    for (T itemEvaluated : items) {
      if (item.compareTo(itemEvaluated) < 0) {
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args) {
    //System.out.println(calculateMin(23, 54));
    //System.out.println(calculateMin(new Person(45, "Adam"), new Person(78, "Kevin")));
    System.out.println(add(5.5d, 0.01));
  }

}
