package generics.generic.method;

public class AppMethod {

  public static void main(String[] args) {
    GenericMethod method = new GenericMethod();
    //System.out.println("Item is returned: " + method.showItem(34.5));
    //method.printItems("Adam", 3);

    Integer[] numbers = {1, 2, 3, 4, 5, 6};
    String[] names = {"Adam", "Ana", "Daniel", "Kevin"};
    method.showItems(numbers);

    method.showItems(names);
  }
}
