package datastructuresandalgorithms;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arrayToOrder = {100, 1992, -4, 60, 51, 3, 12, 9, 4, 7};
    int sizeArray = arrayToOrder.length;

    System.out.println("---INICIO DEL ORDENAMIENTO POR INSERCIÓN DE MENOR A MAYOR---");
    insertionSort(arrayToOrder, sizeArray);
    printVectorValues(arrayToOrder, sizeArray);
  }

  public static void insertionSort(int[] arrayToOrder, int sizeArray) {
    int currentValue, secondIterator;

    for (int firstIterator = 1; firstIterator < sizeArray; firstIterator++) {
      currentValue = arrayToOrder[firstIterator];
      secondIterator = firstIterator - 1;

      while(secondIterator >= 0 && arrayToOrder[secondIterator] > currentValue) {
        arrayToOrder[secondIterator + 1] = arrayToOrder[secondIterator];
        secondIterator -= 1;
      }
      arrayToOrder[secondIterator + 1] = currentValue;
    }
  }

  public static void printVectorValues(int[] numbersVector, int vectorSize) {
    for (int i = 0; i < vectorSize; i++) {
      System.out.printf("%d ", numbersVector[i]);
    }
    System.out.println();
  }
}
