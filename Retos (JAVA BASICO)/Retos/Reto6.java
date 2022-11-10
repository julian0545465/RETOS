package Retos;
import java.util.Scanner;
import java.util.Random;
public class Reto6 {
    
    public static void main(String[] args) {

        int selection, bet, repeat = 1, l1 = 0, total = 0, n1 = 2, losses = 0;
        int machineSelection = 0;
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		while(repeat==1)
		{
		
			//Veces jugadas:
			l1++;

		System.out.println("-----------------------------Carisellazo----------------------------");
		machineSelection = 1+random.nextInt(2);	
        System.out.println("");

        System.out.println("Ingresar cuanto dinero quiere apostar");
        bet = in.nextInt();
        System.out.println("");

		System.out.println("Ingresar una opción \n Ingresar el numero 1 para elegir Cara \n Ingresar el numero 2 para elegir Sello");
		selection = in.nextInt();
		System.out.println("");

		System.out.println("La maquina elegio: ");
		switch (machineSelection)
		{  
			case 1:
				System.out.println("Cara");
				switch (selection)
				{
					case 1: System.out.println("Ganó");
					total = total + (bet * n1 ); 
                    break;
					case 2: System.out.println("Perdió"); 
					losses = bet - losses;
                    break;
				}
				break;

			case 2:
				System.out.println("Sello");
				switch (selection)
				{
					case 1: System.out.println("Perdió"); 
					losses = bet - losses;
                    break;
					case 2: System.out.println("Ganó"); 
					total = total + (bet * n1 );
                    break;
				}
				break;
                default: System.out.println("Error, opcion no valida");
                break;

		    }

			System.out.println("");
			System.out.println("¿Quiere volver a jugar?");
			System.out.println("Ingresar una opción \n Ingresar el numero 1 para volver a jugar \n Ingresar el numero 2 para salir del juego");
			repeat = in.nextInt();
			System.out.println("");

	    }

		System.out.println("Usted jugó " + l1 + " veces");
		System.out.println("Usted ganó un total de: " + total);
		System.out.println("Usted perdió un total de: " + losses);
		
        in.close();

    }
      
}
