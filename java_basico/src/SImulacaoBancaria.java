import java.util.Scanner;

public class SImulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo += scanner.nextInt();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    int valor = scanner.nextInt();
                    if (valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
