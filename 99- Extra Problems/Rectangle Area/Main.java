import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
	Scanner scan = new Scanner(System.in);

	System.out.println("This program calcuates the area of a rectangle");
	
	System.out.println("Please enter  height:");
	
	double height = scan.nextDouble();
	
	System.out.println("Please enter your width:");
	
	double width  = scan.nextDouble();


	double area  = width * height;

	System.out.println("The area is " + area);

  }
}

