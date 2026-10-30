void main(){
    Scanner scanner = new Scanner(System.in);
    int num, num2;

    System.out.println(" Digite os numeros");
    num = scanner.nextInt();
    num2 = scanner.nextInt();

    if (num % num2 == 0 || num2 % num ==0 ){
        System.out.println("São multiplos");
    }else{
        System.out.println("Não são");
    }

    scanner.close();
}