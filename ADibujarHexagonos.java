package adibujarhexagonos;

import java.util.Scanner;

public class ADibujarHexagonos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String caracter = null;
        numero = sc.nextInt();
        caracter = sc.next();
        while (numero != 0 && caracter != "0") {
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j < numero; j++) {
                    System.out.print(".");                    
                }
                for (int j = numero; j < numero * 2 ; j++) {
                    System.out.print(caracter);                    
                }
                numero--;
                System.out.println("");
            }
            
        }

    }
}
