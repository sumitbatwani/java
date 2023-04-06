import java.util.Scanner;

class CelsiusToFahrenheit {
  static int CtoF(int C) {
    int F = 9*C/5+32;
    return F;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter temp in Celsius");
    int C = input.nextInt();
    int F = CtoF(C);
    System.out.println("Temperature in Farheniet");
    System.out.println(F);
    input.close();
  }
}