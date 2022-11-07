class CompareTo {
  public static void main(String[] args) {
    String a = "apple";
    String b = "banana";
    String c = "candy";
    String d = "Apple";
    String e = "apples";

    System.out.println(a.compareTo(b));
    System.out.println(c.compareTo(b));
    System.out.println(a.compareTo(d));
    System.out.println(a.compareTo(""));
    System.out.println(a.compareTo(e));
    System.out.println(a.compareTo("apple"));
  }
}