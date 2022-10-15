import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter triangle base followed by height: ");
    double base = myScanner.nextDouble();
    double height = myScanner.nextDouble();
    double area = 0.5 * base * height;
    System.out.println("The area of the  triangle is: " + area);  

    myScanner.close();

  }
}