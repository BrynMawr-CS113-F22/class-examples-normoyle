// Aline Normoyle, 2022
// Bryn Mawr College

class LoopPattern2 {
  public static void main(String[] args) {
    System.out.println("Enter a length: ");
    int len = Integer.parseInt(System.console().readLine());

    String result = "";
    for (int i = 1; i <= len; i++) {
      if (i % 2 == 1) {
        result += "*";
      } else {
        result += "_";
      }
    }
    System.out.println(result);
  }
}
