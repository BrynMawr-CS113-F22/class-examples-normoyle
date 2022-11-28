class CheckInteger {
  public static void main(String[] args) {
    
    int value = 0;
    boolean valid = false;
    while (!valid) {
      System.out.print("Enter an integer: ");
      String input = System.console().readLine();
      try {
        value = Integer.parseInt(input);
        valid = true;
      }
      catch (RuntimeException e) {
        System.out.println("Sorry, this value is invalid");
      }
    }

    System.out.println("You entered "+value);
  }
}