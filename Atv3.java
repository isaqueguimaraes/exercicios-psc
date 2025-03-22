import java.util.Scanner;

public class Atv3 {

  public static void main(String[] args) {
    double temperatura;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus Celsius: ");
    temperatura = scanner.nextDouble();

    if (temperatura >= 25) {
      System.out.print("Temperatura: " + temperatura);
      System.out.print("°C, no momento está quente.");
    } else if (temperatura < 25) {
      System.out.print("Temperatura: " + temperatura);
      System.out.print("°C, no momento está frio.");
    }
    scanner.close();
  }
}
