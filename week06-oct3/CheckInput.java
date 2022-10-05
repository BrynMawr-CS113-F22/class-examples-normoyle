class CheckInput {

  public static boolean IsInteger(String input) {
    // algorithm: if any character is not a digit [0,9], 
    //   we should return false. Otherwise, we should return true
    if (input.length() == 0) {
      return false;
    }

    int startIndex = 0;
    if (input.charAt(0) == '-') {
      startIndex = 1;
    }

    for (int i = startIndex; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c < '0' || c > '9') {
        return false;
      }
    }
    return true;
  }  

  public static void main(String[] args) {
    // Add code here to test your IsInteger function
    System.out.println(IsInteger("9-B7") == false);
    System.out.println(IsInteger("-7") == true);
    System.out.println(IsInteger("7988775") == true);
    System.out.println(IsInteger("798.8775") == false);
    System.out.println(IsInteger("-798.8775") == false);
    System.out.println(IsInteger("877-798") == false);
    System.out.println(IsInteger("") == false);
    System.out.println(IsInteger("apple") == false);
  }
}