import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("podaj liczbe:");
    Scanner scanx = new Scanner(System.in);
    double x = scanx.nextDouble();
    double y;
    y=(x%10);    
    System.out.println("Reszta z dzielenia to: "+y);
  }
}