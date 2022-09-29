import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double gallons = 0;
    double fuelEfficiency = 0;
    double gasPrice = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Input number of gallons of gas in the tank: ");
    if(in.hasNextDouble()) {
      gallons = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }
    System.out.print("Input fuel efficiency in miles per gallon: ");
    if(in.hasNextDouble()) {
      fuelEfficiency = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }
    System.out.print("Input the price of gas per gallon: ");
    if(in.hasNextDouble()) {
      gasPrice = in.nextDouble();
    } else {
      String invalid = in.nextLine();
      System.out.println("You entered '" + invalid + "', which is invalid. Please try again.");
      System.exit(-1);
    }
    double hundredMileCost = 100 * gasPrice / fuelEfficiency;
    double distance = gallons * fuelEfficiency;
    System.out.println("The cost per 100 miles is: $" + hundredMileCost);
    System.out.println("The car can go " + distance + " miles with the gas in the tank");
  }
}