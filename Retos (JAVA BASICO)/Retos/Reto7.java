package Retos;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {

        int quantity;
        double add = 0, result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de notas que desea evaluar");
        quantity = in.nextInt();
        double notes[] = new double[quantity];
        System.out.println("");


        for(int i=0; i<quantity; i++){
            System.out.println("Ingresar la nota: " +i);
            notes[i] = in.nextDouble();
            add += notes[i];
            System.out.println("");
        }
        result = add/quantity;

        System.out.println("|-----------------------------------------------------------------|");
        System.out.println("Promedio de las notas: " + result);
       
        if (result < 3)
           {
            System.out.println("Reprobaste 😥");
            System.out.println("|-----------------------------------------------------------------|");

           }
           else if(result >3 && result<4 )
           {
            System.out.println("Pasaste Raspando");
            System.out.println("|-----------------------------------------------------------------|");

           }
           else{
            System.out.println("Aprobaste con buenos resultados");
            System.out.println("|-----------------------------------------------------------------|");
           }
           
        in.close();
        }
    }
    
    