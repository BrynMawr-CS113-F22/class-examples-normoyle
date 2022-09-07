class CheckHeight2 {
  public static void main(String[] args) {
    System.out.print("Enter a height (inches): ");
    int h = Integer.parseInt(System.console().readLine());

    if (h > 36) {
      println("Taller than 3 ft");
    }
    else if (h > 60) {
      println("Taller than 5 ft");
    }
    else if (h > 48) {
      println("Taller than 4 ft");
    }
    else {
      println("Too small for this ride");
    }
}
}