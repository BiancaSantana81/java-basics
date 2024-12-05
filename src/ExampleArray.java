import java.util.Arrays;

/**
 *  Aprendendo a lidar com arrays em Java.
 */
public class ExampleArray {
  /**
   * main function.
   */
  public static void main(String[] args) {
    char[] values = new char[5];

    Arrays.fill(values, 'a');

    for (char value : values) {
      System.out.print(value);
    }
    System.out.print("\n");

    char[][] matrix = new char[5][5];

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        matrix[i][j] = 'b';
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.print("\n");
    }
  }
}