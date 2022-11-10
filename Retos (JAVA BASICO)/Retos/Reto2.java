package Retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args)
    { 
     Scanner in = new Scanner (System.in);
     int age; //meses
     double weight;
     int n1= 10;
     int n2= 8; 
     
     System.out.println("Ingresar el peso del bebé");
     weight = in.nextDouble();
     System.out.println("");
     
     System.out.println("Ingresar los meses del bebé");
     age = in.nextInt();
     
     double dose = (weight + n1) / (age * n1) * n2; 
     System.out.println("");
     
     System.out.println("La dosis que se le debe aplicar al bebé es: " + dose);
     in.close();

    
    }

}
