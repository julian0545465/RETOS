package Retos;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {

        int quantity;
 
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de competidores");
        quantity = in.nextInt();
        System.out.println("");

        String competitors[] = new String[quantity];
        int timecompetitors[] = new int[quantity];
        
        for(int i=0; i<competitors.length; i++){
            System.out.println("Ingresar el nombre del competidor número: " +i);
            competitors[i] = in.next();
            System.out.println("");
            System.out.println("Ingresar el tiempo del competidor número: " +i);
            timecompetitors[i] = in.nextInt();
            System.out.println("");
        }

        System.out.println("|----------------------------------------------------------------------------------------------------|");
        for(int i=0; i<competitors.length; i++){
            System.out.println("El competidor: " +competitors[i]+", tuvo un tiempo de : "+ timecompetitors[i] +" minutos");    
        }

        in.close();
    }

}
