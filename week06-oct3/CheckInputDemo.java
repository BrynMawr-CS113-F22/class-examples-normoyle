class CheckInputDemo {
  public static void main(String[] args) {
    String test = "9-B7";
    String test2 = "-4567";

    if (CheckInput.IsInteger(test)) {
      System.out.println(test+" is an integer");
    }    
    else {
      System.out.println(test+" is NOT an integer");
    }
  }
}