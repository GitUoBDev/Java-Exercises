import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter Q1: ");
    double quiz1 = myScanner.nextDouble();
    System.out.println("Enter Q2: ");
    double quiz2 = myScanner.nextDouble();
    System.out.println("Enter Q3: ");
    double quiz3 = myScanner.nextDouble();
    System.out.println("Enter Midterm: ");
    double midtermExam = myScanner.nextDouble();
    System.out.println("Enter Final: ");
    double finalExam = myScanner.nextDouble();

    double finalScore = (((quiz1+quiz2+quiz3)/15) * 100  * 0.25) 
    + ((midtermExam/30) * 100 * 0.35)  + ((finalExam/30) * 100 * 0.4) ;
    
    System.out.println("The final score is: " + finalScore);  

    myScanner.close();

  }
}