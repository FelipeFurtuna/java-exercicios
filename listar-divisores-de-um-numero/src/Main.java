void main(){
    Scanner scanner = new Scanner(System.in);
    int N;

    System.out.println("digite o valor de N: ");
    N = scanner.nextInt();

    for (int i = 1; i <= N; i++) {

        if (N % i == 0) {
            System.out.println(i);

        }
    }
    scanner.close();
}