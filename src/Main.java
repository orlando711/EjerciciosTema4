public class Main {
    public static void main(String[] args) {

        int numeroIf=1, numeroWhile=0, numeroFor;
        String estacion= "Verano";

        if(numeroIf>=0){
            if(numeroIf==0){
                System.out.println("NumeroIF es cero");
            }
            else{
                System.out.println("NumeroIF es positivo");
            }
        }
        else{
            System.out.println("NumeroIF es negativo");
        }

        while (numeroWhile<3){
            System.out.println("NumeroWhile = "+numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do{
            System.out.println("NumeroDoWhile = "+numeroWhile);
        }while (numeroWhile>3);

        for(numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("NumeroFor = "+numeroFor);
        }

        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default: System.out.println("No es una estación");

        }
    }
}