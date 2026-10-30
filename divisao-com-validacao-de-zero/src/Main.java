void main(){


        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.println("Digite as repetições: ");
        N = scanner.nextInt();

        for (int i = 0; i <N ; i++) {

            double valor1;
            double valor2;
            double resultado;

            System.out.println("Digite o valor: ");
            valor1 = scanner.nextDouble();

            System.out.println("Digite o valor: ");
            valor2 = scanner.nextDouble();

            if (valor2 ==0){
                System.out.println("divisao impossivel");
            } else {

                resultado = valor1 / valor2;
                System.out.printf("%.1f%n", resultado);
            }

        }

        scanner.close();
}