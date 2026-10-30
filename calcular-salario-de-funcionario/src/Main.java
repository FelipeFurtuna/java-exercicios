import java.util.Locale;
import java.util.Scanner;

void main() {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);
    int number;
    double workshour, hoursalary, salary;

    System.out.println("");
    System.out.println("Ola seja bem vindo!");
    System.out.println("Digite o numero do funcionario: ");
    number = scanner.nextInt();
    System.out.println("Agora digite quantas horas ele trabalhou pro senhor: ");
    workshour = scanner.nextDouble();
    System.out.println("Agora digite quanto ele recebe por hora: ");
    hoursalary = scanner.nextDouble();

    salary = hoursalary * workshour;

    System.out.println("NUMBER = "+ number);
    System.out.printf("SALARY = U$%.2f%n", salary);
    scanner.close();
}
