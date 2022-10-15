import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter a measurment in inches: ");
    double inches = myScanner.nextDouble();
    double centimeters = inches * 2.54;
    System.out.println("The value in centimeters is: " + centimeters);  

    myScanner.close();

  }
}