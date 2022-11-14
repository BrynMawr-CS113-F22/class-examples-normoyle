class BankBalances {

  public static Customer[] LoadBalances(String filename) {
    In file = new In(filename);
    String[] lines = file.readAllLines();
    Customer[] customers = new Customer[lines.length];

    for (int i = 0; i < lines.length; i++) {
      String line = lines[i];
      String[] tokens = line.split(",");
      String name = tokens[0];
      String balance = tokens[1];
      double balanceValue = Double.parseDouble(balance);

      Customer c = new Customer(name, balanceValue);
      customers[i] = c;
    }
    return customers;
  }

  public static void swap(int i, int j, Customer[] L) {
    Customer tmp = L[i];
    L[i] = L[j];
    L[j] = tmp;
  }

  public static void bubbleSort(Customer[] L) {
    for (int n = 0; n < L.length; n++) {
      for (int j = 1; j < L.length; j++) {
        if (L[j-1].getBalance() < L[j].getBalance()) {
          swap(j-1, j, L);
        }
      }
    }
  }

  public static void main(String[] args) {
    Customer[] customers = LoadBalances("balances.csv");

    bubbleSort(customers); // sort out list of customers

    for (int i = 0; i < customers.length; i++) {
      System.out.println(customers[i]);
    }



  }
}