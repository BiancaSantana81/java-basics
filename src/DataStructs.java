import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Aprendendo a trabalhar com List e HasMap
 */

public class DataStructs {
  /**
   * main function.
   */
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    // Adicionando valores dentro de arrayList

    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
    }

    // Imprimindo valores

    System.out.println(arrayList);

    // Usando HashMap

    HashMap<String, Integer> examScores = new HashMap<String, Integer>();

    examScores.put("Math", 10);

    System.out.println(examScores);
  }
}