import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter water amount (Kg): ");
    double mass = myScanner.nextDouble();
    System.out.println("Enter initial temperature: ");
    double initTemp = myScanner.nextDouble();
    System.out.println("Enter final temperature: ");
    double finalTemp = myScanner.nextDouble();
    
    double energyNeeded = mass * (finalTemp - initTemp) * 4184;

    System.out.println("The energy needed is" + energyNeeded + "joules");  

    myScanner.close();

  }
}