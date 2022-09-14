// Aline Normoyle, 2022
// Bryn Mawr College

class IsPrimary4 {
  public static void main(String[] args) {
    System.out.print("Enter a color: ");
    String color = System.console().readLine();

    // check: color != red and color != yellow and color != blue
    boolean isRed = color.compareTo("red") == 0;
    boolean isYellow = color.compareTo("yellow") == 0;
    boolean isBlue = color.compareTo("blue") == 0;

    if (!isRed && !isYellow && !isBlue){
      System.out.println(color + " is NOT primary.");
    } else {
      System.out.println(color + " is primary.");
    }

  }
}
