package MOD03;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
        //FALTA

        //Seccion variables
        Scanner num;
        num = new Scanner(System.in);
        int x, divisor, modulo;
        String res = "";

        //Seccion datos
        System.out.println("Ingrese el numero: ");
        x = num.nextInt();
        System.out.println("-> " + (12 / 5));
        System.out.println("-> " + (2 / 5));

        //Seccion proceso
        
        for (int i = 0; i < 10; i++) {
            
            /*if(divisor == 0){
                break;
            }*/
        }
        divisor = x / 16;
        do {
            divisor = divisor / 16;
            modulo = divisor % 16;
            res = res + modulo;
            System.out.println("xxx");

        } while (divisor != 0);

        //Seccion proceso
        System.out.println("Resultado: " + res);

    }

}
