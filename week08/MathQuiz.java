class MathQuiz {

  public static int showQuestion() {
    // function stub: an empty placeholder function
    int a = (int) (Math.random() * 100);
    int b = (int) (Math.random() * 100);
    System.out.print(a + " + " + b + " = ");
    return a+b;
  }

  public static int askForNumber() {
    String input = System.console().readLine();
    while (!CheckInput.IsInteger(input)) {
      System.out.print("Invalid input: Please enter an integer: ");
      input = System.console().readLine();
    }
    int value = Integer.parseInt(input);
    return value;
  }

  public static void main(String[] args) {
    // show welcome message
    System.out.println("--------------------");
    System.out.println("Welcome to Math Quiz");
    System.out.println("--------------------");

    int score = 0;
    for (int i = 0; i < 5; i++) {
      int answer = showQuestion();
      int userAnswer = askForNumber();
      if (answer != userAnswer) {
        System.out.println("Sorry, the answer is "+answer);
      }
      else {
        score++;
        System.out.println("Correct!!!!");
      }
    }

    double average = score/5.0;
    System.out.printf("Your score is %.2f %d/%d\n", average, score, 5);
  }
}