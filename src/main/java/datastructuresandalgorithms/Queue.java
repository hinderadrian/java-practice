package datastructuresandalgorithms;

public class Queue {

  private final static int SIZE = 5;
  static int[] values = new int[SIZE];
  static int front = -1;
  static int rear = -1;

  public static void enQueue(int value) {
    if (rear == SIZE - 1) {
      System.out.printf("No se puede guardar el valor %d debido a que la queue está llena%n", value);
    } else {
      if (front == -1) {
        front = 0;
      }
      rear++;
      values[rear] = value;
      System.out.printf("Se insertó el valor %d correctamente%n", value);
    }
  }

  public static void deQueue() {
    if (front == -1) {
      System.out.println("La queue está vacía.");
    } else {
      System.out.printf("Se eliminó el valor %d de la queue%n", values[front]);
      front++;
      if(front == SIZE) {
        front = rear = -1;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("INICIO DEL EJEMPLO DE COLA (QUEUE):");
    enQueue(1);
    enQueue(2);
    enQueue(3);
    enQueue(4);
    enQueue(5);

    enQueue(6);
    deQueue();
    deQueue();
    deQueue();
    deQueue();
    deQueue();
    deQueue();
    enQueue(13);
    enQueue(14);
    enQueue(15);
    enQueue(16);
    enQueue(17);
    deQueue();
    deQueue();
    deQueue();
    deQueue();
    deQueue();
    deQueue();
  }

}
