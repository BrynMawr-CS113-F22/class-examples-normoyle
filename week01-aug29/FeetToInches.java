// Bryn Mawr College, 2021
// Compute the tip on a meal

public class FeetToInches {
    public static void main(String[] args)
    {
        System.out.print("Enter length in feet: ");
        double feet = Double.parseDouble(System.console().readLine());

        double inches = feet * 12; // 12 inches in a foot
        System.out.println("The length in inches is "+inches);
    } 
}
