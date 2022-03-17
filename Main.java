import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*PREGUNTA#1 - Solicite al usuario el nombre de una planta y de una ciudad y presente el total de
		 megavatios de consumos para dicha ciudad en dicha planta

		 PREGUNTA#2 - Solicite al usuario el nombre de una ciudad y presente un nuevo diccionario cuyas claves
		 son los nombres de las plantas generadoras y el valor es el total megavatios que cada
		 planta le ha dado a ciudad. Si la planta no entrega energía a la ciudad entonces esa planta
		 no debería aparecer en el nuevo diccionario

		 PREGUNTA#3 - Solicite el nombre de una región al usuario y presente cuanto dinero ha recaudado la
		 región Sierra

		 PREGUNT#4 - Presentar el consumo total del mes ingresado*/
		
		boolean control= false;
		String opc;
		Scanner leer;
		
		do {
			leer= new Scanner(System.in);
			System.out.println("\n\t\t\t\t\t-- MENÚ --");
			System.out.println("\n1. Presentar el total de megavatios de consumo de la ciudad que se ingrese en la planta ingresada");
			System.out.println("2. Presentar el total de megavatios dados por la planta respectiva a la ciudad ingresada");
			System.out.println("3. Presentar el dinero recaudado por región");
			System.out.println("4. Presentar el dinero generado por mes en las respectivas plantas");
			System.out.println("5. Terminar el programa");
			System.out.print("\nElija una opción: ");
			opc= leer.nextLine();
			switch(opc) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				System.out.println("\nFIN DEL PROGRAMA");
				control= true;
				break;
			default:
				System.out.println("\nOPCIÓN INCORRECTA");
			}
		}while(control==false);

	}

}
