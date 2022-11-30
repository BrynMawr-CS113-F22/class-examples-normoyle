class ExceptionEx {
  public static void main(String[] args) {
    int[] values = new int[3];
    try {
      for (int i = 0; i < values.length+1; i++) {
        values[i] = i;
      }
    }
    catch (RuntimeException e) {
      /*
      System.out.println("CATCH! "+e.getMessage());
      e.printStackTrace();
      System.out.println("----------------");
      */
    }
    System.out.println("Hello exceptions!");
  }
}