class Bird extends Animal {

  public Bird() {
    this.name = "Bird";  
    this.weight = 1;  
    this.vertebrate = true;  
    this.numberOfLimbs = 4;  
  }

  public void locomote() {
    System.out.println("Fly!");
  }
}