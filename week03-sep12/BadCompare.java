class BadCompare {
  public static void main(String[] args) {
    String a1 = "apple";
    String a2 = args[0];
    
    if (a1 == "apple") {
      System.out.println("a1 was equal to apple");
    }

    if (a1.compareTo(a2) == 0) {
      System.out.println("a1 was equal to a2");
    }
  }
}