void main() {

    Scanner scanner = new Scanner(System.in);
    int escolha = 0;

    int Gasolina = 0;
    int Diesel = 0;
    int alcool = 0;

    while (escolha != 4) {
        System.out.println("Escolha o seu serviço: ");
        System.out.println("(1) alcool (2) gasolina (3) diesel (4)Finalizar");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                alcool = alcool + 1;
                System.out.println(" glup glup glup chei de alcool");
                break;
            case 2:
                Gasolina = Gasolina + 1;
                System.out.println(" glup glup glup chei de gasolina");
                break;
            case 3:
                Diesel = Diesel + 1;
                System.out.println(" glup glup glup chei de diesel");
                break;
            case 4:
                System.out.println("MUITO OBRIGADO");
                break;
            default:
                System.out.println("valor invalido, digite novamente");

        }
    }
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + Gasolina);
    System.out.println("Diesel: " + Diesel);

    scanner.close();
}
