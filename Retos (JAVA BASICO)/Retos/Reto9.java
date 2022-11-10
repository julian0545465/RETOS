package Retos;
import java.util.Scanner;
public class Reto9 {
    public static void main(String[] args) {

//         En una competencia de natación se desea implementar una
// aplicación para almacenar el tiempo por cada competidor. El usuario
// debe especificar cuantos competidores participarán en la
// competencia y digitar los nombres y tiempos de cada uno. Muestre en
// pantalla cada nadador con su respectivo tiempo. Plantee de qué
// forma podría determinar quien es el ganador.


        Scanner in = new Scanner(System.in);

        String[][] matriz = new String[4][4];
        String[][] price = new String[4][4];

        for(int fila=0;fila<4;fila++)
        {
        for(int columna=0;columna<4;columna++)
        {
        System.out.println("Ingrese el producto de la fila " +fila+ " y de la Columna "  +columna);
        matriz[fila][columna]=in.next();
        System.out.println("");
        System.out.println("Ingrese el precio del producto de la fila " +fila+ " Columna "  +columna);
        price[fila][columna]=in.next();
        System.out.println("");
        }
        }


        for(int fila=0;fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                System.out.print("|" +matriz[fila][columna] + ": " +price[fila][columna] +"|");
            }
            System.out.println("");
        
        }
        in.close();
    }      

 
}


