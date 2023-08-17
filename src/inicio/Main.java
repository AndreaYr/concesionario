package inicio;

import logica.Auto;
import logica.Concesionario;
import logica.Moto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Auto miAuto = new Auto();
		Moto miMoto = new Moto();
		Concesionario concesionario = new Concesionario();

		int opcion;

		do {
			System.out.println("\t BIENVENIDO\n\n" +
					"1. Registrar vehículo\n" +
					"2. Buscar vehículo\n" +
					"3. Listar vehículos disponibles\n" +
					"4. Vender vehículo\n" +
					"5. Mostrar cantidad de vehículos\n" +
					"6. Actualizar datos de vehículo\n" +
					"7. Mostrar el valor de ventas totales\n" +
					"8. Eliminar vehículo\n" +
					"9. salir");

			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					System.out.println("¿Qué tipo de vehiculo desea registrar?\n" +
							"1. Auto\n" +
							"2. Moto\n" +
							"3. Camion");
					int opc = entrada.nextInt();

					System.out.println("Digite los siguientes datos:");

					System.out.println("Placa");
					String placa = entrada.nextLine();
					System.out.println("Marca");
					String marca = entrada.nextLine();
					System.out.println("Referencia");
					String referencia = entrada.nextLine();
					System.out.println("Modelo");
					String modelo = entrada.nextLine();
					System.out.println("Cantidad de ruedas");
					int num_ruedas = entrada.nextInt();

					concesionario.registarVehiculo(opc, placa, marca, referencia, modelo, num_ruedas);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Error, intente nuevamente");
					break;
			}

		}while (opcion == 9);

	}

}
