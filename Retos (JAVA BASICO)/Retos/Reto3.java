package Retos;
import java.util.Scanner;
import java.util.Random;
public class Reto3 {
    public static void main(String args[])
	{
        int selection;
        int machineSelection = 0;
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Carisellazo");
		machineSelection = 1+random.nextInt(2);
		
        System.out.println("");


		System.out.print("Ingresar una opción \n Ingresar el numero 1 para elegir Cara \n Ingresar el numero 2 para elegir Sello");
		selection = in.nextInt();

		System.out.println("La maquina elegio: ");
		switch (machineSelection)
		{  
			case 1:
				System.out.println("Cara");
				switch (selection)
				{
					case 1: System.out.println("Ganó"); 
                    break;
					case 2: System.out.println("Perdió"); 
                    break;
				}
				break;

			case 2:
				System.out.println("Sello");
				switch (selection)
				{
					case 1: System.out.println("Perdió"); 
                    break;
					case 2: System.out.println("Ganó"); 
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;

		}

		in.close();
	}
    
}
