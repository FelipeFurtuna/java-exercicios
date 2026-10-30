void main(){

    Scanner scanner = new Scanner(System.in);

    double x;
    double y;

    System.out.println("Digite um valor: ");
    x = scanner.nextDouble();
    System.out.println("Digite um valor: ");
    y = scanner.nextDouble();

    if (x>0 && y>0){
        System.out.println("Q1");
    } else if (x < 0 && y>0){
        System.out.println("Q2");
    } else if (x < 0 && y <0){
        System.out.println("Q3");
    } else if (x > 0 &&  y<0) {
        System.out.println("Q4");
    } else if (x==0 && y ==0) {
        System.out.println("origem");
    }
}