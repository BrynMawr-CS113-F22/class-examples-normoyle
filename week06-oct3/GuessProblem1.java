class GuessProblem1 {

  public static int AskForNumber() {
    // Use a loop to repeatedly ask the user for a integer and return it
    // Algorithm:
    // While the input is incorrect
    //    Ask the user for another input
    //    Read in input

    String userInput = System.console().readLine();
    while (!CheckInput.IsInteger(userInput)) {
      System.out.print(userInput + " is invalid! Please enter a number: ");
      userInput = System.console().readLine();
    }

    int userNumber = Integer.parseInt(userInput);
    while (userNumber < 0 || userNumber > 100) {
      System.out.print(userNumber + " is not in range! Please enter a number: ");
      userInput = System.console().readLine();
      userNumber = Integer.parseInt(userInput);
    }
    return userNumber;
  }

  public static void main(String[] args) {
    int number = (int) (Math.random() * (99) + 1);

    System.out.print("Enter a number: ");
    int userNumber = AskForNumber();

    while (userNumber != number) {
      if (userNumber < number) {
        System.out.println("Wrong number! Too low! ");
      }
      else if (userNumber > number) {
        System.out.println("Wrong number! Too high! ");
      }
      System.out.print("Enter a number: ");
      userNumber = AskForNumber();
    }

    System.out.println("You guessed it! " + number);
  }
}