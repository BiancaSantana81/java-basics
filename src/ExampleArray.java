import java.util.Arrays;

/**
 *  Aprendendo a lidar com arrays em Java.
 */
public class ExampleArray {
  /**
   * main function.
   */
  public static void main(String[] args) {

    // Preenchendo diretamente no array:

    char[] objValues = {'a', 'b', 'c', 'd', 'e'};

    System.out.println("Valores em objValues: ");

    for (char value : objValues) {
      System.out.print(value);
    }
    System.out.print("\n");

    // Preenchendo com fill:

    char[] values = new char[5];
    Arrays.fill(values, 'a');

    System.out.println("Valores em values: ");
    for (char value : values) {
      System.out.print(value);
    }
    System.out.print("\n");

    // Criando e preenchendo uma matriz:

    char[][] matrix = new char[5][5];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        matrix[i][j] = 'b';
      }
    }

    System.out.println("Valores em matrix: ");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.print("\n");
    }
  }
}