//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    int num1,num2;
    int soma;
    System.out.println("");
    System.out.println("------------------------");
    System.out.println("Digite o primeiro valor: ");
    num1= scanner.nextInt();
    System.out.println("-------------------------");
    System.out.println("Digite o segundo valor: ");
    num2= scanner.nextInt();
    soma = (num1 + num2);
    System.out.println("A soma dos dois numero digitados é: " +soma);


    scanner.close();
}
