void main(){

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    int valor = 1;
    int N;
    System.out.println("Digite o valor de N");
    N = scanner.nextInt();

    for (int i = 1; i <= N ; i++) {

        valor = valor *i;
    }
    System.out.println(valor);
scanner.close();
}