class Animal {
  protected String name;
  protected int weight;
  protected boolean vertebrate;
  protected int numberOfLimbs;

  public Animal() {
    this.name = "UnknownAnimal";  
    this.weight = 0;  
    this.vertebrate = false;  
    this.numberOfLimbs = 0;  
  }
  public void locomote() {
    System.out.println("locomote");
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weight;
  }
}