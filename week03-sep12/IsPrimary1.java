// Aline Normoyle, 2022
// Bryn Mawr College

class IsPrimary1 {
  public static void main(String[] args) {
    System.out.print("Enter a color: ");
    String color = System.console().readLine();

    // check: color == red or color == yellow or color == blue
    if (color.compareTo("red") == 0 || 
        color.compareTo("yellow") == 0 || 
        color.compareTo("blue")== 0 ) {
      
      System.out.println(color + " is primary.");
    } else {
      System.out.println(color + " is NOT primary.");
    }
  }
}
