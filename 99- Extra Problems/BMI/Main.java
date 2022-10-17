import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
	Scanner scan = new Scanner(System.in);

	System.out.println("This program calcuates your BMI");
	
	System.out.println("Please enter your height:");
	
	double height = scan.nextDouble();
	
	System.out.println("Please enter your weight:");
	
	double weight  = scan.nextDouble();


	double bmi  = weight  / ( height * height);

	// Severe Thinness	< 16
	// Moderate Thinness	16 - 17
	// Mild Thinness	17 - 18.5
	// Normal	18.5 - 25
	// Overweight	25 - 30
	// Obese Class I	30 - 35
	// Obese Class II	35 - 40
	// Obese Class III	> 40

	System.out.println("Your bmi is " + bmi);

	if (bmi >= 16 && bmi <= 18.5) {
		System.out.println("Thin");
	} 
	else if(bmi >= 18.5 && bmi <= 25 ){
		System.out.println("Normal");
	}
	else if(bmi >= 25){
		System.out.println("Exercise");
	}

  }
}