package logica;
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    //arraylist de vehiculos
    ArrayList<String> vehiculos = new ArrayList<String>();

    //constructor
    public Concesionario(){}

    Scanner entrada = new Scanner(System.in);


    /**
     * Método que permite agregar un nuevo vehiculo al arraylist
     * @param tipo_vehiculo
     * @param placa
     * @param marca
     * @param referencia
     * @param modelo
     * @param num_ruedas
     */
    public void registarVehiculo(int tipo_vehiculo, String placa, String marca, String referencia, String modelo, int num_ruedas){

        if(tipo_vehiculo == 1){ //opcion de auto
            System.out.println("cantidad de puertas");
            int num_puertas = entrada.nextInt();
            System.out.println("¿Es de gasolina?");
            boolean is_gasolina = entrada.nextBoolean();

            Auto auto = new Auto();

            auto.setPlaca(placa);
            auto.setMarca(marca);
            auto.setReferencia(referencia);
            auto.setModelo(modelo);
            auto.setNum_ruedas(num_ruedas);
            auto.setNum_puertas(num_puertas);
            auto.setIs_gasolina(is_gasolina);

            vehiculos.add(String.valueOf(auto));

            System.out.println("Auto registrado exitosamente");

        } else if (tipo_vehiculo == 2) {

            System.out.println("Cilindraje");
            int cilindraje = entrada.nextInt();
            System.out.println("Tamaño del tanque");
            double tam_tanque = entrada.nextDouble();

            Moto moto = new Moto();
            moto.setPlaca(placa);
            moto.setMarca(marca);
            moto.setReferencia(referencia);
            moto.setModelo(modelo);
            moto.setNum_ruedas(num_ruedas);
            moto.setCilindraje(cilindraje);
            moto.setTam_tanque(tam_tanque);

            vehiculos.add(String.valueOf(moto));

            System.out.println("Moto registrado exitosamente");

        }else {
            System.out.println("Capacidad de carga");
            String cap_carga = entrada.nextLine();

            Camion camion = new Camion();

            camion.setPlaca(placa);
            camion.setMarca(marca);
            camion.setReferencia(referencia);
            camion.setModelo(modelo);
            camion.setNum_ruedas(num_ruedas);
            camion.setCap_carga(cap_carga);

            vehiculos.add(String.valueOf(camion));

            System.out.println("Camion registrado exitosamente");

        }
    }

    public void buscarVehiculo(String placa, String marca, String referencia, String modelo, double precio){

        for(String vehiculo: vehiculos){
            if(placa.equals(vehiculo) || marca.equals(vehiculo) || referencia.equals(vehiculo) || modelo.equals(vehiculo)){

            }
        }
    }
}
