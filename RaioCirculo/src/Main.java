import java.util.Locale;

void main() {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    double raio;
    double area;



    System.out.println("Ola, digite o raio do seu círculo: ");
    raio = scanner.nextDouble();
    area = 3.14159 * (raio * raio);
    System.out.printf("A area do seu círculo é: %.4f%n", area);



    scanner.close();
}
