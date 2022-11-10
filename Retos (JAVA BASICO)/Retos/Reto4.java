package Retos;
import java.util.Random;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args)
    { 
        int selection, machineSelection;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
       
        System.out.println("Bienvenido al juego piedra, papel o tijera");
        System.out.println("");
        System.out.println("Elegir una de las siguientes opciones: \n Ingresar el numero 1 si su elección es piedra \n Ingresar el numero 2 si su elección es papel \n Ingresar el numero 3 si su eleccion es tijera");
        selection = in.nextInt();
        machineSelection = 1+random.nextInt(3);

        System.out.println("La maquina elegio: ");
        switch (machineSelection)
		{  
			case 1:
				System.out.println("Piedra");
				switch (selection)
				{
					case 1: System.out.println("Empataron"); 
                    break;
					case 2: System.out.println("Ganó"); 
                    break;
                    case 3: System.out.println("Perdió"); 
                    break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch (selection)
				{
					case 1: System.out.println("Perdió"); 
                    break;
					case 2: System.out.println("Empataron"); 
                    break;
                    case 3: System.out.println("Ganó"); 
                    break;
				}
				break;

            case 3:
				System.out.println("Tijera");
				switch (selection)
				{
					case 1: System.out.println("Ganó"); 
                    break;
					case 2: System.out.println("Perdió"); 
                    break;
                    case 3: System.out.println("Empataron"); 
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;
    }
    in.close();
    }
}
    

