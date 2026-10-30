import java.util.Locale;
void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    double a,b,c;
    double areaT;
    double areaC;
    double areaTp;
    double areaQ;
    double areaR;

    System.out.println("");
    System.out.println("seja bem vindo!");


    System.out.println("Digite o valor de A: ");
    a = scanner.nextDouble();
    System.out.println("Digite o valor de B: ");
    b = scanner.nextDouble();
    System.out.println("Digite o valor de C: ");
    c = scanner.nextDouble();

    areaT = a * c / 2;
    areaC = 3.14159 * (c * c);
    areaTp = ((a + b)* c) / 2;
    areaQ = b * b;
    areaR = a * b;

    System.out.printf("TRIANGULO: %.3f%n", areaT);
    System.out.printf("CIRCULO: %.3f%n", areaC);
    System.out.printf("TRAPEZIO: %.3f%n", areaTp);
    System.out.printf("QUADRADO %.3f%n", areaQ);
    System.out.printf("RETANGULO: %.3f%n", areaR);


    scanner.close();


}
