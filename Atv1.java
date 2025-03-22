import java.util.Scanner;

public class Atv1 {

  public static void main(String[] args) {
    double notaUm, notaDois, media;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vamos calcular sua média.");
    System.out.println("Digite sua primeira nota: ");
    notaUm = scanner.nextDouble();

    System.out.println("Digite sua segunda nota: ");
    notaDois = scanner.nextDouble();

    media = (notaUm + notaDois) / 2;

    if (media >= 7) {
      System.out.println("Você foi aprovado! Sua média é: " + media);
    } else {
      System.out.println("Sua média é: " + media);
    }
    scanner.close();
  }
}
