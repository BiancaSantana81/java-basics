import java.util.Scanner;

/**
 * Aprendendo a pegar valores da linha de comando.
 */
public class UserInput {
  /**
   * Para receber inputs do usuário podemos usar a classe Scanner (que precisa ser importada).
   * Além deste método, podemos também pegar diretamente da linha de comando com args.
   *
   * @param args argumentos recebidos da linha de comando.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name? ");
    String name = scanner.nextLine();

    System.out.print("Hello, " + name + "! How old are you? ");
    int age = scanner.nextInt();

    // cleans buffer
    scanner.nextLine();

    System.out.print(age + " is an excellent age to start learning Java!");

    scanner.close();
  }
}