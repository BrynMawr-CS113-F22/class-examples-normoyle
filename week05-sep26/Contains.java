class Contains {
  
  public static boolean contains(String phrase, char c) {
    // your code here
    // algorithm: go through each character in phrase 
    //     for each character, check whether it is equal to c
    
    int count = 0;
    for (int i = 0; i < phrase.length(); i++) {
      char p = phrase.charAt(i);
      if (p == c) {
        count++;
      } 
    }
    // return false if none of the characters equals c
    return count > 0;
  }
  
  public static void main(String[] args) {
    boolean result = contains("lolcats", 'a');
    System.out.println(result); // should print true

    result = contains("lolcats", 'g');
    System.out.println(result); // should print false
  }
}
