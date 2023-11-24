public class Smartphone extends DispositivoElectronicoDeConsumo {
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;

    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, Sensor sensorDeHuella, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla = pantalla;
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    
    @Override
    public String toString() {
        return "\nEspecificaciones del Smartphone: " + "\n" + "Distribuidor= " + getdistribuidor() + "\n" +
                "Numero de Serie= " + getnumSerie() + "\n" +
                "Marca= " + getMarca() + "\n" +
                "Nombre= " + getNombre() + "\n" +
                "Costo= " + getprecio() + "\n" + sensorDeHuella + "\n" + pantalla;
    }
}