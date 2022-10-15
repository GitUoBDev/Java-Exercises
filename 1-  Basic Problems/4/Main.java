import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter Name: ");
    String name = myScanner.nextLine();
    System.out.println("Enter an 8 digit ID: ");
    int id = myScanner.nextInt();
    int batchYear = id / 10000;

    System.out.println("The batch year for " + name + " is: " + batchYear);  

    myScanner.close();

  }
}