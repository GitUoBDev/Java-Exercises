import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter height in centimeters (140-240): ");
    double height = myScanner.nextDouble();
    double idealWeight = height - 100;

    if(height >= 140 && height <=240 ){
    System.out.println("Your ideal weight is: " + idealWeight + " kg");  
    }
    else { System.out.println("Wrong input"); }

    myScanner.close();

  }
}