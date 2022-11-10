package Retos;
import java.util.Scanner;
public class Reto5 {
 
    public static void main(String[] args) {

        int quantity;
        int price, total = 0;
        

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar cuantos productos desea comprar");
        quantity = in.nextInt();
        System.out.println("");

        for(int i = 1; i <= quantity; i++){
            System.out.println("Ingresar el precio del producto numero: " +i);
            price = in.nextInt();
            System.out.println("");

            total = total + price;

        }

        System.out.println("Los productos fueron: " + quantity + " con un precio total de : " + total);

        in.close();
    }
}
