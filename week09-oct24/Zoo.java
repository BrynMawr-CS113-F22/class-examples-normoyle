class Zoo {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal bird = new Bird();
    Animal flamingo = new Flamingo();

    animal.locomote();
    bird.locomote();
    flamingo.locomote();

    System.out.println(animal.getName()+" weighs "+animal.getWeight());
    System.out.println(bird.getName()+" weighs "+bird.getWeight());
    System.out.println(flamingo.getName()+" weighs "+flamingo.getWeight());
  }
}