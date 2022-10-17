import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter hours worked: ");
    double hoursWorked = myScanner.nextDouble();

    double regularHours = 0;
    double overTimeHours = 0;

    if( hoursWorked <= 20 ){
      regularHours = hoursWorked;  
    }
    else if ( hoursWorked > 20 ) { 
      regularHours = 20;  
      overTimeHours = hoursWorked - 20;  
    }

    double amountPaid = ( (regularHours * 2.0) + (overTimeHours * 2.5) ) * 0.95;
    System.out.println("Amount paid: " + amountPaid  + " BD" );

    myScanner.close();

  }
}