class RDouble {
  public static String idouble(String s) {
    String tmp = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      tmp += c;
      tmp += c;
    }
    return tmp;
  }

  // implementation 1: using substring
  /*
  public static String rdouble(String s) {
    if (s.length() == 0) return "";
  
    System.out.println(s);
    char c = s.charAt(0);
    String prefix = "";
    prefix += c;
    prefix += c;
    return prefix + rdouble(s.substring(1));
  }*/

  public static String rdouble(String s, int idx) {
    if (idx > s.length()-1) return "";
  
    char c = s.charAt(idx);
    String prefix = "";
    prefix += c;
    prefix += c;
    return prefix + rdouble(s, idx+1);
  }

  public static String rdouble(String s) {
    return rdouble(s, 0);
  }


  public static void main(String[] args) {
     String test = "";
     test = idouble("lol");
     System.out.println("Iterative double: "+test);

     test = rdouble("lol");
     System.out.println("Recursive double: "+test);
  }
}