
void main() {

    Scanner scanner =new Scanner(System.in);

    double largura, comprimento;
    double area, precofin;
    double valor = 200;
    System.out.println();
    System.out.println("Ola seja bem vindo");
    System.out.println("Este é um app de calculo de Valor de Terreno");
    System.out.println("_____________________________________________");
    System.out.println("Digite a Largura do terreno do seu interesse: ");
    largura = scanner.nextDouble();
    System.out.println("Agora diga o comprimento: ");
    comprimento = scanner.nextDouble();
    area = (largura * comprimento);
    System.out.println();
    System.out.printf(" A area do seu terreno é de %.2f%n", area);
    System.out.println("---------------------------------");
    precofin = (valor * area);
    System.out.printf("O valor total do seu terreno é de: $%.2f%n", precofin);



    scanner.close();

}
