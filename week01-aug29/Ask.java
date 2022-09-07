// Bryn Mawr College
// 2021
// A simple program that asks the user for input

class Ask {

    public static void main(String[] args) {
        System.out.println("What is your name? ");
        String name = System.console().readLine(); 
        System.out.println("Hi, "+name);
    }

}