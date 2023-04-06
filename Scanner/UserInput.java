import java.util.Scanner;

/*
* Scanner class constructor takes 
* System.in to provide Scanner object that
* has nextInt to take integer.
*/

class UserInput {  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number:");
    int a = input.nextInt();
    
    System.out.println("Enter second number:");
    int b = input.nextInt();
    
    System.out.println("Enter third number:");
    int c = input.nextInt();
    
    int result = a*b+c;
    System.out.println("Result:");
    System.out.println(result);
  }
}