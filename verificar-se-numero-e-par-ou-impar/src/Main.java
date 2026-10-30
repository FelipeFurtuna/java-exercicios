void main(){
    Scanner scanner = new Scanner(System.in);
    int num;
    System.out.println("");
    System.out.println("Digite um numero e vou descobrir se ele é par ou impar!");
    num = scanner.nextInt();

    if ((num/2) * 2 == num){
        System.out.println("Par");
    }else {
        System.out.println("impar");
    }
    scanner.close();
}