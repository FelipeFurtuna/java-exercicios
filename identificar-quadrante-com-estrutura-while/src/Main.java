void main (){
    Scanner scanner = new Scanner(System.in);
    int x = 1;
    int y = 1;

    while (x != 0 && y != 0){
        System.out.println("Digite o valor de X e depois o de Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x<0 && y < 0){
            System.out.println("Terceiro quadrante!");
        } else if (x>0 && y >0) {
            System.out.println("Primeiro quadrante! ");
        } else if (x<0 && y > 0) {
            System.out.println("Segundo quadrante! ");
        } else if (x>0 && y<0) {
            System.out.println("Quarto quadrante! ");
        }
    }


    scanner.close();
}