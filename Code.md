# Basic Problems

## 1. Celesius to Fahrenheit

Write a program that converts a distance measure from inches to cents. Note that one inch is equal to 2.54
centimeters?
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 2. Area of a Triangle

The area of a triangle is computed by taking half the product of its base and height.

`Area = 1/2× base × height`

Write a program that reads the base and height of a triangle and displays the area.
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 3. Student Scores

Students are awarded points toward their grades based upon the addition of the average of three quizzes
(Q1, Q2, Q3), the midterm exam (MT), and the final exam (F INAL). Quizzes are marked out of 5, the midterm
is out of 30, and the final is out of 70. Compute the total points using a Java program and print the result out
of 100 according to the following percentages: Quizzes: 25%, Midterm: 35%, and Final: 40%.
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 4. Batch Year

Write a program that reads a student name followed by his/her id. The program should then display on screen
the student’s name followed by his/her academic year. For example, the academic year for the id 20102323 is
2010.
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 5. Water Heating Energy

Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperature of the water. The formula to compute the energy is

`Q = M × (final temperature − initial temperature) × 4184`

Where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in
joules.
<details>
  <summary> Solution </summary>

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter water amount (Kg): ");
    double mass = myScanner.nextDouble();
    System.out.println("Enter initial temperature: ");
    double initTemp = myScanner.nextDouble();
    System.out.println("Enter final temperature: ");
    double finalTemp = myScanner.nextDouble();
    
    double energyNeeded = mass * (finalTemp - initTemp) * 4184;

    System.out.println("The energy needed is" + energyNeeded + "joules");  

    myScanner.close();

  }
}
```
</details>

<br/>

## 6. Weather Forecast

Write a Java program that will predict tomorrow’s temperature given today’s temperature readings. The program
will first ask the user to enter two values: the temperature median value and current temperature reading. The
program will calculate and display the expected temperature according to the following equation:

`Expected temperature = 2 × median temperature − current temperature`
<details>
  <summary> Solution </summary>

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter temperature median value: ");
    double medianTemp = myScanner.nextDouble();
    System.out.println("Enter current temperature: ");
    double currentTemp = myScanner.nextDouble();
    
    double expectedTemp =  2 * medianTemp - currentTemp;

    System.out.println("Expected temperature is" + expectedTemp);  

    myScanner.close();

  }
}
```
</details>

<br/>

## Question Template 

Question Details
<details>
  <summary> Solution </summary>

```java

```
</details>