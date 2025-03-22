import java.util.Scanner;

public class Atv2 {

  public static void main(String[] args) {
    double notaUm, notaDois, media;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Vamos calcular sua média. ");
    System.out.print("Digite sua primeira nota: ");
    notaUm = scanner.nextDouble();

    System.out.println("Digite sua segunda nota: ");
    notaDois = scanner.nextDouble();
    media = (notaUm + notaDois) / 2;

    if (media > 7) {
      System.out.println("Parabéns, você foi aprovado! Sua média é: " + media);
    } else if (media < 7) {
      System.out.println("Você foi reprovado. Sua média é: " + media);
    }
    scanner.close();
  }
}
