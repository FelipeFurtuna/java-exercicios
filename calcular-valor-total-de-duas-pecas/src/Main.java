import java.util.Locale;
import java.util.Scanner;

void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int peca1, peca2;
    int quantidade, quantidade2;
    double valor, valor2, valorfinal;
    System.out.println("");
    System.out.println("Ola seja bem vindo!");
    System.out.println("Digite o numero, quantidade e o valor da peça1: ");
    peca1 = scanner.nextInt();
    quantidade = scanner.nextInt();
    valor = scanner.nextDouble();

    System.out.println("----------------------------------------------");
    System.out.println("Digite o numero, quantidade e o valor da peça2: ");
    peca2 = scanner.nextInt();
    quantidade2 = scanner.nextInt();
    valor2 = scanner.nextDouble();

    valorfinal = (quantidade * valor) + ( quantidade2 * valor2);
    System.out.printf("Valor a pagar RS%.2f%n", valorfinal);
    scanner.close();

}
