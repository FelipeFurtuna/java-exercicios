void main(){

    Scanner scanner = new Scanner(System.in);
    int num;
    System.out.println("Vou descobrir se o numero é positivo ou negativo!");
    System.out.println("");
    System.out.println("digite um numero: ");
    num = scanner.nextInt();

    if (num < 0){
        System.out.println("Nunero negativo!");
    } else if (num > 0){
        System.out.println("Numero positivo");
    } else{
        System.out.println("você digitou zero");
    }
scanner.close();

}