void main() {
    Scanner scanner = new Scanner(System.in);

    int N;

    System.out.println("digite o valor de N: ");
    N = scanner.nextInt();

    for (int i = 1; i <= N; i++) {
        int quadrado = i * i;
        int cubo = i * i * i;

        System.out.println(i + " " + quadrado + " " + cubo);
    }

    scanner.close();
}