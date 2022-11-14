class Customer {

  private String name;
  private double balance;
  
  public Customer(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }  

  public String getName() {
    return this.name;
  }

  public double getBalance() {
    return this.balance;
  }

  public String toString() {
    return this.name+" "+this.balance;
  }

  public static void main(String[] args) {
    Customer c = new Customer("Bill Larry", 3256);
    System.out.println("Customer: "+c);
  }

}
