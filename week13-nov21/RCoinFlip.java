class RCoinFlip {
  public static int icoinflip(int n) {
    int numheads = 0;
    for (int i = 0; i < n; i++) {
      double dice = Math.random();
      System.out.println("dice: "+dice);
      if (dice < 0.5) {
        numheads++;
      }
    }
    return numheads;
  }

  public static int rcoinflip(int n) {
    if (n == 0) {
      return 0;
    }

    double dice = Math.random();
    System.out.println("dice: "+dice);
    if (dice < 0.5) {
      return 1 + rcoinflip(n-1);
    }
    else {
      return rcoinflip(n-1);
    }
  }

  public static void main(String[] args) {
    int numheads = 0;
    numheads = icoinflip(10);
    System.out.println("Iterative coin flip: "+numheads);

    numheads = rcoinflip(10);
    System.out.println("Recursive coin flip: "+numheads);
  }
}