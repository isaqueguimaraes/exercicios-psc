import java.util.Scanner;

public class Atv4 {

  public static void main(String[] args) {
    double notaUm, notaDois, media;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua primeira nota: ");
    notaUm = scanner.nextDouble();

    System.out.println("Digite sua segunda nota: ");
    notaDois = scanner.nextDouble();
    media = (notaUm + notaDois) / 2;

    if (media == 10) {
      System.out.println("Parabéns! Você foi aprovado com excelência!");
    } else if (media >= 7) {
      System.out.println("Você foi aprovado.");
    } else if (media >= 5) {
      System.out.println("Você está em recuperação.");
    } else {
      System.out.println("Você foi reprovado.");
    }
    scanner.close();
  }
}
