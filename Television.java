
public class Television extends DispositivoElectronicoDeConsumo {
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    
    @Override
    public String toString() {
        return "\nEspecificaciones de la Television: " + "\n" + "Distribuidor= " + getdistribuidor() + "\n" +
                "Numero de Serie= " + getnumSerie() + "\n" +
                "Marca= " + getMarca() + "\n" +
                "Nombre= " + getNombre() + "\n" +
                "Costo= " + getprecio() + "\n"+ pantalla;
    }
}