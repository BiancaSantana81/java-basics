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

    // assim comparará o endereço de memória

    System.out.println(literalString1 == literalString2);
    System.out.println(object1 == object2);

    // assim comparará o conteúdo no endereço de memória
    System.out.println(object1.equals(object2));

    // Replace pode alterar no momento da impressão, mas não pode alterar o conteúdo da var string.
    String example = "O céu é azul.";

    System.out.println(example.replace("azul", "vermelho"));
    System.out.println(example);

    // Para refletir a substituição, é necessário atribuir o resultado a uma nova variável
    // ou sobrescrever a original. O conteúdo antigo será removido pelo Garbage Collector.

    String exampleReplace = example.replace("azul", "vermelho");
    System.out.println(exampleReplace);
  }
}