import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("How many balloons do you want? ");
    int balloonCount = myScanner.nextInt();

    if(balloonCount >= 500 && balloonCount <=1000 ){
    System.out.println("Total amount: " + balloonCount * 8 + " fils" );  
    }
    else if (balloonCount > 1000) { System.out.println("Total amount: " + balloonCount * 6 + " fils" ); }
    else { System.out.println("Not enough balloons ordered"); }

    myScanner.close();

  }
}