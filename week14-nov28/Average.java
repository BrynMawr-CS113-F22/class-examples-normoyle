import java.util.ArrayList;

class Average {
  public static void main(String[] args) {

    ArrayList<Integer> values = new ArrayList<Integer>();

    int sum = 0;
    boolean timeToQuit = false;
    while (!timeToQuit) {
      System.out.print("Enter a value: ");
      String input = System.console().readLine();
      if (input.equals("")) {
        timeToQuit = true;
      }
      else {
        int value = Integer.parseInt(input);
        values.add(value);
        sum += value;
      }
    }

    double average = 0;
    if (values.size() > 0){
      average = sum / values.size();
    }
    System.out.println("The average is "+average);

    for (int i = 0; i < values.size(); i++) {
      int value = values.get(i);
      if (value < average) {
        System.out.println(value + " is less than average");
      }
    }
  }
}