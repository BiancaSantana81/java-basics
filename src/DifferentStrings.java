/**
 * Aprendendo sobre strings em Java.
 */
public class DifferentStrings {
  /**
   * Em Java é possível criar strings literais que podem ser comparadas diretamente.
   * Também é possível criar alocando memória e (dessa maneira) elas não são diretamente comparadas.
   */
  public static void main(String[] args) {

    // String literal

    String literalString1 = "abc";
    String literalString2 = "abc";

    // String alocando memória

    String object1 = new String("efg");
    String object2 = new String("efg");

    System.out.println(literalString1 == literalString2);
    System.out.println(object1 == object2);
  }

}