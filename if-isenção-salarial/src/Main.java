void main(){
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);
    double salario;
    System.out.println("----------------------------------------------------------");
    System.out.println("bem vindo a central de atualização de salario banco lisarb");
    System.out.println("-----------------------------------------------------------");
    System.out.println("digite o salario: ");
    salario = scanner.nextDouble();

    if (salario >=0 && salario <=2000.00){
        System.out.println("isento");
    } else if (salario>2000.00 && salario <=3000.00) {
        double bruto;
        double juros;

         bruto = (salario -2000.00);
        juros = bruto * 0.08;
        System.out.printf("%.2f%n", juros);
    } else if (salario) {
        
    }
    scanner.close();
}