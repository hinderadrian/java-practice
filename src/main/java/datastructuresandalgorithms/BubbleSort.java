package datastructuresandalgorithms;

public class BubbleSort {

  public static void main(String[] args) {
    int[] numbersVector = {100, 1992, -4, 60, 51, 3, 12, 9, 4, 7};
    int vectorSize = numbersVector.length;

    System.out.println("---INICIO DEL ORDENAMIENTO DE BURBUJA DE MENOR A MAYOR---");
    bubbleSort(numbersVector, vectorSize);
    printVectorValues(numbersVector, vectorSize);
    System.out.println("---INICIO DEL ORDENAMIENTO DE BURBUJA DE MAYOR A MENOR---");
    reverseBubbleSort(numbersVector, vectorSize);
    printVectorValues(numbersVector, vectorSize);
    System.out.println("---FIN DEL ORDENAMIENTO DE BURBUJA---");
  }

  public static void changePosition(int[] numbersVector, int biggerNumberPosition, int minorNumberPosition) {
    int tempValue = numbersVector[biggerNumberPosition];
    numbersVector[biggerNumberPosition] = numbersVector[minorNumberPosition];
    numbersVector[minorNumberPosition] = tempValue;
  }

  public static void bubbleSort(int[] numbersVector, int vectorSize) {
    for (int i = 0; i < vectorSize - 1; i++) {
      for (int j = 0; j < vectorSize - i - 1; j++) {
        if (numbersVector[j] > numbersVector[j + 1]) {
          changePosition(numbersVector, j, j + 1);
        }
      }
    }
  }

  public static void reverseBubbleSort(int[] numbersVector, int vectorSize) {
    for (int i = 0; i < vectorSize - 1; i++) {
      for (int j = 0; j < vectorSize - i - 1; j++) {
        if (numbersVector[j] < numbersVector[j + 1]) {
          changePosition(numbersVector, j + 1, j);
        }
      }
    }
  }

  public static void printVectorValues(int[] numbersVector, int vectorSize) {
    for (int i = 0; i < vectorSize; i++) {
      System.out.printf("%d ", numbersVector[i]);
    }
    System.out.println();
  }
}
