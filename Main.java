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
		
		Region reg= new Region(null, null);
		Consumo cons= new Consumo(null, null);
		FuncionamientoElectrico fun= new FuncionamientoElectrico();
		boolean control= false;
		String opc, nombre_planta, planta, ciudad, nom_ciudad = null, region, nom_region;
		Scanner leer;
		PlantaEléctrica plae = new PlantaEléctrica("", "");
		int c=0, con_Generador[], mes;
		double inf_mensual[];
		
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
					do {
					leer= new Scanner(System.in);
					System.out.println("\n\t-- Total de megavatios de consumo de la ciudad que se ingrese en la planta ingresada --");
					System.out.print("\nSeleccione la planta: ");
					System.out.println("\n1. Coca Codo Sinclair\n2. Sopladora");
					System.out.print("\nElija una opción: ");
					planta= leer.nextLine();
					switch(planta) {
					case "1":
						nombre_planta= "Coca Codo Sinclair";
						plae= new PlantaEléctrica(planta, nombre_planta);
						do {
							System.out.print("\nSeleccione la ciudad: ");
							System.out.println("\n1. Quito\n2. Guayaquil");
							System.out.print("\nElija una opción: ");
							leer= new Scanner(System.in);
							ciudad= leer.nextLine();
							switch(ciudad) {
							case "1":
								nom_ciudad= "Quito";
								cons= new Consumo(ciudad, nom_ciudad);
								c=0;
								break;
							case "2":
								nom_ciudad= "Guayaquil";
								cons= new Consumo(ciudad, nom_ciudad);
								c=0;
								break;
							default:
								System.out.println("\nCiudad incorrecta");
								c=3;
							}
						}while(c==3);
						cons.consumoCiudadCoca(nom_ciudad);
						System.out.println("\n        -- Información --");
						System.out.println("\n   "+plae.toString());
						System.out.println("   "+cons.toString());
						System.out.println("   Total de megavatios: " + fun.wattsCiudad(cons));
						c=0;
						break;
					case "2":
						nombre_planta= "Sopladora";
						plae= new PlantaEléctrica(planta, nombre_planta);
						do {
							System.out.print("\nSeleccione la ciudad: ");
							System.out.println("\n1. Guayaquil\n2. Quito\n3. Loja");
							System.out.print("\nElija una opción: ");
							leer= new Scanner(System.in);
							ciudad= leer.nextLine();
							switch(ciudad) {
							case "1":
								nom_ciudad= "Cuayaquil";
								cons= new Consumo(ciudad, nom_ciudad);
								c=0;
								break;
							case "2":
								nom_ciudad= "Quito";
								cons= new Consumo(ciudad, nom_ciudad);
								c=0;
								break;
							case "3":
								nom_ciudad= "Loja";
								cons= new Consumo(ciudad, nom_ciudad);
								c=0;
								break;
							default:
								System.out.println("\nCiudad incorrecta");
								c=4;
							}
						}while(c==4);
						cons.consumoCiudadSopladora(nom_ciudad);
						System.out.println("\n        -- Información --");
						System.out.println("\n   "+plae.toString());
						System.out.println("   "+cons.toString());
						System.out.println("   Total de megavatios: " + fun.wattsCiudad(cons));
						c=0;
						break;
					default:
						System.out.println("\nPlanta incorrecta");
						c=3;
					}
					}while(c==3);
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
					System.out.println("\n\t\t    -- Dinero generado por mes en las respectivas plantas --");
				do {
					System.out.print("\nIngrese un valor del 1-12, los cuales representan los meses del año: ");
					mes= leer.nextInt();
					switch(String.valueOf(mes)) {
					case "1","2","3","4","5","6","7","8","9","10","11","12":
						inf_mensual= fun.valorMensual(mes-1, cons);
						String nombre_mes[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
						System.out.println("\n        -- Información --");
						System.out.println("\n   Mes:" + nombre_mes[mes-1]);
						System.out.println("   Coca Codo Sinclair: $" + inf_mensual[0]);
						System.out.println("   Sopladora: $" + inf_mensual[1]);
						System.out.println("   Total: $" + inf_mensual[2]);
						c=0;
						break;
					default:
						System.out.println("Mes incorrecto");
						c=2;
					}
				}while(c==2);
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
