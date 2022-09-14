// Aline Normoyle, 2022
// Bryn Mawr College

class Square1 {
  public static void main(String[] args) {
    System.out.println("Enter a size: ");
    int size = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
