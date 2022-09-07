// Bryn Mawr College
// 2021
// A simple program that asks the user for input
class FavoriteAnimal {

    public static void main(String[] args) {
        System.out.print("What is your favorite animal? ");
        String name = System.console().readLine(); 
        System.out.println("I think "+name+" are cool. My favorite animals are turtles.");
    }
 
}