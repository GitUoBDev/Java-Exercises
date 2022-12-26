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

# Selection Problems

## 1. Weight/Height Relation

Write a program to find the ideal weight for a given height. The height must be given in centimeters between
140 cm and 240 cm. The ideal weight is the height minus 100. Before calculating the height check that the input
is valid?
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 2. Balloons Price

ACE balloon shop sells balloons to customers at 10 fils each. If the customer buys 500 −1000 balloons, the price
is 8 fils each. If the customer buys over 1000 balloons, the price is 6 fils each. Write a program that reads the
number of balloons to purchase and prints the amount of the bill?

<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

## 3. Employee Wage 

A part time employee is paid BD. 2/000 per hour for the first 20 hours in a week. Additional hours are paid
BD. 2/500 per hour. In addition the company deducts 5% of the total weekly income for health insurance. Find
how much (s)he will be paid for any given number of hours?
<details>
  <summary> Solution </summary>

```java
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
```
</details>

<br/>

# Extra: Tic-Tac-Toe Example

A basic game
<details>
  <summary> Solution </summary>

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        int  square = 0, turns=0;
        char winner=' ';

        Scanner sc = new Scanner(System.in);

        while(turns!=9){
            System.out.print("Choose where to play 1-9: ");
            square = sc.nextInt();
            int i= (square-1)/3,j=(square-1)%3;
            if(board[i][j]>0){continue;}
            board[i][j] = (turns%2==0)?'x':'o';

            for(int row=0;row<board.length;row++){
                for (int col = 0; col < board[row].length; col++) {
                    if(board[row][col]>0){System.out.print(board[row][col]+" ");}
                    else{System.out.print("_ ");}
                }
                System.out.println();
            }

            if(board[i][0]>0&&board[i][0]==board[i][1]&&board[i][1]==board[i][2]){winner=board[i][0];break;}
            if(board[0][j]>0&&board[0][j]==board[1][j]&&board[1][j]==board[2][j]){winner=board[0][j];break;}
            if(board[0][0]>0&&board[0][0]==board[1][1]&&board[1][1]==board[2][2]){winner=board[1][1];break;}
            if(board[0][2]>0&&board[0][2]==board[1][1]&&board[1][1]==board[2][0]){winner=board[1][1];break;}

            turns++;
        }

        if(winner=='o'||winner=='x'){System.out.println(winner + " wins!");}
        else{System.out.println("It's a draw!");}
    }
  }
```
</details>

<br/>

# Extra: Books Example (Using parallel arrays and classes)

Provided the following information
about a number books (title,pages,subject,owner):

Linear Algebra , 200 , Maths , none Thermodynamics , 700 , Physics , none
Astrophysics , 500 , Physics , none

Write a program that:

- Prints information for all books
- Find the physics book with most number of pages

<details>
<summary>Solution using parallel arrays</summary>

```java
public class Main{ 

  public static void printInfo(String t,int p,String s,String o){
    System.out.println("Book: " + t + " - " + p + " pages" 
  + " ("+ s +") " + "Owner: " + o);}

  public static void main(String[] args){

    String[] titles = {"Linear Algebra","Thermodynamics","Astrophysics"};
    int[] noPages = {200,700,500};
    String[] subject = {"Maths","Physics","Physics"};
    String[] owner = new String[3];
    
    // print info for all books
    System.out.println("\nAll books info:");
    for (int i = 0; i < titles.length; i++) {
      printInfo(titles[i],noPages[i],subject[i],owner[i]);
    }
    
    // find physics book with most number of pages
    int maxPages = noPages[0], maxBookId=0;
    for (int i = 0; i < titles.length; i++) {
      if(subject[i].equals("Physics") &&  
      maxPages<noPages[i])
      {maxPages=noPages[i]; maxBookId=i;}
    }
    System.out.println("\nPhysics book with most number of pages:");
    printInfo(titles[maxBookId],noPages[maxBookId],subject[maxBookId],owner[maxBookId]);

  } 
  
}
  
```
</details>

<details>
<summary>Solution using classes</summary>

```java
class Book{
    public String title;
    public int noPages;
    public String subject;
    public String owner;
  
    Book(String t,int p, String s){ title=t; noPages = p; subject = s; }
    public void printInfo(){System.out.println("Book: " + title + " - " + noPages + " pages" 
    + " ("+ subject +") " + "Owner: " + owner);}
    public String getOwner(){return owner;}
    public void setOwner(String s){owner=s;}
  }
  
  public class Main{ 
  
    public static void main(String[] args){
      
      Book[] books = {
        new Book("Linear Algebra", 200 , "Maths"),
        new Book("Thermodynamics", 700 , "Physics"),
        new Book("Astrophysics", 500 , "Physics"),
      };
      
      // print info for all books
      System.out.println("\nAll books info:");
      for (int i = 0; i < books.length; i++) {
        books[i].printInfo();
      }
  
      // find physics book with most number of pages
      int maxPages = books[0].noPages, maxBookId=0;
      for (int i = 0; i < books.length; i++) {
        if(books[i].subject.equals("Physics") &&  
        maxPages<books[i].noPages)
        {maxPages=books[i].noPages; maxBookId=i;}
      }
      System.out.println("\nPhysics book with most number of pages:");
      books[maxBookId].printInfo();
  
    } 
    
  }
    
```
</details>

<br/>

<!--
# Extra: Cat and Owner

Basic 2 classes interaction example
<details>
  <summary> Solution </summary>

```java
class Human{
    public String name;
    Human(String name){ this.name = name; } 
    public void call(Cat c){ 
      System.out.println(this.name + " called " + c.name + " the cat");
      if(this == c.owner){c.purr();}else{c.hiss();} 
    }
      public void feed(Cat c){ 
      System.out.println(this.name + " tried feeding " + c.name + " the cat");
      if (c.hungerLevel>0) {
        System.out.println(c.name + " is eating"); c.hungerLevel--;  
      }else{System.out.println(c.name+" is sleeping");}
     }
  }
  
  class Cat{
    public String name;
    public Human owner; 
    public int hungerLevel = 3;
    Cat(String name, Human h){ this.name = name; this.owner = h; } 
    public void hiss(){System.out.println(this.name + ": Ssss");}
    public void purr(){System.out.println(this.name + ": Prrr");}
  }
  
  public class Main{ 
  
    public static void main(String[] args){
      
      Human human1 = new Human("John");
      Human human2 = new Human("Jack");
      Cat cat1 =  new Cat("Tom",human1);
      Cat cat2 =  new Cat("Tim",human2);
      
      human1.call(cat1);
      human1.call(cat2);
  
      human1.feed(cat2);
      human1.feed(cat2);
      human1.feed(cat2);
      human1.feed(cat2);
      human1.feed(cat2);
    } 
    
  }
    
```
</details> 
-->

# Extra: Hotel Example

Make a class hotel
<details>
  <summary> Solution </summary>

```java
import java.util.Scanner;

class Hotel{ 

    private String name;
    private int rooms;
    private int resvRooms;
    private double price;
    private String[] roomNames;
    
    Hotel(String n,int r,int rs,double p){ 
        name = n; rooms = r; resvRooms = rs; price = p;
     }

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    
    public void booking(){
        if(resvRooms<rooms) {resvRooms++; System.out.println("Room Reserved");}
        else {System.out.println(name + "'s Hotel is full");}
    }

 }

public class Main {
    
    public static void main(String[] args) {

        Hotel[] myHotels = {
        new Hotel("Hilton1",3,0,2),
        new Hotel("Hilton2",3,0,2),
        new Hotel("Hilton3",3,0,2)
        };

        Hotel h1 = new Hotel("Hilton",3,0,2);
        Hotel h2 = new Hotel("Movempic",2,0,1);

        System.out.println(h1.getName());
        h1.setName("Hammam");
        System.out.println(h1.getName());

        h1.booking();
        h1.booking();
        h1.booking();
        h1.booking();
        h1.booking();

    }
  }
```
</details> 

<!-- 
## Question Template 

Question Details
<details>
  <summary> Solution </summary>

```java

```
</details> 
-->