import java.util.Locale;
void main(){
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    int N;

    System.out.println("Digite a quantidade de repetições: ");
    N = scanner.nextInt();



    for (int i = 0; i < N ; i++) {
        double v1;
        double v2;
        double v3;

        System.out.println("Digite o primeiro valor: ");
        v1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        v2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        v3 = scanner.nextDouble();

        double media = (v1 * 2 + v2 * 3 + v3 * 5) /10 ;

        System.out.printf("%.1f%n", media);
    }
    scanner.close();
}