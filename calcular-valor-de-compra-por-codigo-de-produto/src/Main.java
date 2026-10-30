void main(){

    Scanner scanner = new Scanner(System.in);
    int item;
    int quantidade;
    double valor = 0;

    System.out.println("");
    System.out.println("Digite o codigo do item: ");
    item = scanner.nextInt();
    System.out.println("");
    System.out.println("agora digite a quantidade: ");
    quantidade = scanner.nextInt();

    if (item == 1){
        valor = 4.00 * quantidade;
    } else if (item == 2){
        valor = 4.50 * quantidade;
    } else if (item == 3){
        valor = 5.00 * quantidade;
    } else if (item == 4) {
        valor = 2.00 * quantidade;
    } else if (item == 5){
        valor = 1.50 * quantidade;
    }
    System.out.printf("total: R$%.2f%n", valor);

    scanner.close();
}