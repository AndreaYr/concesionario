package logica;

public class Camion extends Vehiculo{
    private String cap_carga;

    public Camion(){
    }

    public Camion(String placa, String marca, String referencia, String modelo, int num_ruedas, String cap_carga){
        super(placa, marca, referencia, modelo, num_ruedas);
        this.cap_carga = cap_carga;
    }

    public String getCap_carga() {
        return cap_carga;
    }

    public void setCap_carga(String cap_carga) {
        this.cap_carga = cap_carga;
    }

    @Override
    public void queSoy() {
        System.out.println("Soy un camion");
    }
}
