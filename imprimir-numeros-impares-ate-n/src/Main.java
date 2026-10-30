    void main(){
        Scanner scanner = new Scanner(System.in);

        int x;
        System.out.println("Digite um numero inteiro: ");
        x = scanner.nextInt();

       for (int i=1; i<=x; i++) {
           System.out.println(i);
           i= i+1;
       }
    scanner.close();
    }