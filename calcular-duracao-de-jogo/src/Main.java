
    void main(){
        Scanner scanner = new Scanner(System.in);
        int hr, hr2;
        int resultado;
        System.out.println("");
        System.out.println("Digite que horas começou e que horas terminou o jogo");
        hr = scanner.nextInt();
        hr2 = scanner.nextInt();


        if (hr >=hr2){
            resultado = (hr2 + 24) - hr;
            System.out.println("o jogo durou " + resultado + " Horas");

        } else if (hr < hr2){
            resultado = hr2 - hr;
            System.out.println("o jogo durou " + resultado + " Horas");

        }

        scanner.close();

    }