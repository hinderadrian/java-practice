package libro.cap02.colecciones;

public class TestStack {

  public static void main(String[] args) {
    MyStack<Integer> myStack = new MyStack<>();

    myStack.stackItem(1);
    myStack.stackItem(2);
    myStack.stackItem(3);

    System.out.println(myStack.unstackItem());
    System.out.println(myStack.unstackItem());

    myStack.stackItem(4);

    System.out.println(myStack.unstackItem());
    System.out.println(myStack.unstackItem());
  }

}
