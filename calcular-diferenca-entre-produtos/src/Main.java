//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int a, b , c , d;
    int diferenca;

    Scanner scanner =new Scanner(System.in);
    System.out.println("Digite um numero: ");
    a = scanner.nextInt();
    System.out.println("Digite um numero: ");
    b = scanner.nextInt();
    System.out.println("Digite um numero: ");
    c = scanner.nextInt();
    System.out.println("Digite um numero: ");
    d = scanner.nextInt();

    diferenca = a * b - c * d;

    System.out.println(" A diferença é: " + diferenca);

    scanner.close();

}
