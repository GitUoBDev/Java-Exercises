import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Please enter hours worked: ");
    double hours = myScanner.nextDouble();
    
    double regularHours=0;
    double overTime=0;

    if (hours <=20) {
      regularHours =hours;
      overTime = 0;
    } else {
      regularHours = 20;
      overTime = hours - 20;
    }

    double wage = regularHours * 2 + overTime * 2.5;
    double deduction = wage * 0.05;
    double netWage = wage - deduction;

    System.out.println("You wage will be :" + netWage);

 
    myScanner.close();

  }
}