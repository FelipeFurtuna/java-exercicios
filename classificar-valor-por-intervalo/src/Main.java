void main(){

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double valor;

    System.out.println("Digite um valor qualquer: ");
    valor = scanner.nextDouble();

    if (valor >= 0 && valor <=25){
        System.out.println("Intervalo (0, 25)");
    } else if (valor>25 && valor <=50) {
        System.out.println("intevalo (25, 50)");
    } else if (valor>50 && valor <=75) {
        System.out.println("intervalo (50. 75)");
    } else if (valor>75 && valor <= 100){
        System.out.println("intervalo (75, 100)");
    } else {
        System.out.println("intervalo invalido");
    }

    scanner.close();
}