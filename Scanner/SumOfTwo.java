import java.util.Scanner;

class SumOfTwo {
  static void sum() {
    System.out.println("Sum of two numbers");
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int number1 = input.nextInt();

    System.out.println("Enter second number");
    int number2 = input.nextInt();

    int sum = number1 + number2;
    System.out.println("Total:");
    System.out.println(sum);

    input.close();
  }
  
  public static void main(String[] args) {
    sum();
  }
}