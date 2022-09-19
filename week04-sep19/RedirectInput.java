import java.util.Scanner;

class RedirectInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numInputs = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < numInputs; i++) {
      String input = scanner.nextLine();
      System.out.println(input);
    }
  }
}
