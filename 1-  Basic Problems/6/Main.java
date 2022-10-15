import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter temperature median value: ");
    double medianTemp = myScanner.nextDouble();
    System.out.println("Enter current temperature: ");
    double currentTemp = myScanner.nextDouble();
    
    double expectedTemp =  2 * medianTemp - currentTemp;

    System.out.println("Expected temperature is" + expectedTemp);  

    myScanner.close();

  }
}