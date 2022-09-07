// Bryn Mawr College, 2021
// Compute the tip on a meal

public class Tip {
    public static void main(String[] args)
    {
        System.out.print("Enter the meal price: ");
        double cost = Double.parseDouble(System.console().readLine());

        System.out.print("Enter the tip amount: ");
        double percent = Double.parseDouble(System.console().readLine());

        double tip = cost * percent;
        System.out.println("The tip is "+tip);
    } 
}
