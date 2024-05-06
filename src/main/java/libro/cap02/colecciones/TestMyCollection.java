package libro.cap02.colecciones;

import java.util.Objects;
import java.util.Scanner;

public class TestMyCollection {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    MyCollection mainCollection = new MyCollection(5);
    //Generic classes instances
    MyGenericCollection<String> stringCollection = new MyGenericCollection<>(5);
    MyGenericCollection<Integer> intCollection = new MyGenericCollection<>(5);

    System.out.println("Insert name:");
    String nameInserted  = scanner.next();

    while(!Objects.equals(nameInserted, "FIN")) {
      stringCollection.insert(nameInserted, 0);
      nameInserted = scanner.next();
    }

    for(int i = 0; i < stringCollection.quantity(); i++) {
      String aux = (String) stringCollection.get(i);

      System.out.println(aux + " - " + aux.length() + " characters.");
    }
    
  }

}
