void main(){
    Scanner scanner = new Scanner(System.in);
    int N = 0;
    int in = 0;
    int out =0;
    System.out.println("Digite o valor de N: ");
    N = scanner.nextInt();

    for (int i = 0; i < N; i++) {
        System.out.println("Digite um Valor pra X: ");
        int X = scanner.nextInt();

        if (X>=10 && X<=20){
            in = in +1;
        } else {
            out = out + 1;
        }


    }
    System.out.println("in -" + in);
    System.out.println("out -" +out);
scanner.close();
}