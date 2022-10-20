class StringExs {

  public static void main(String[] args) {
    String s1; // calls constructor
    String s2 = new String(); // call constructor

    String a1 = "apples"; // call constructor
    String a2 = new String("apples"); // call constructor
    
    if (a1.endsWith("es")) {
      System.out.println("Whoa Nelly!");
    }

    String formatted = String.format("%.2f", 3.1456); 
    System.out.println(formatted);
    
  }
}
