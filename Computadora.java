public class Computadora extends DispositivoElectronicoDeConsumo {
    private Procesador cpu;
    private long bytesRAM;

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre,float costo, Procesador cpu, long bytesRAM) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.bytesRAM = bytesRAM;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public long getbytesRAM() {
        return bytesRAM;
    }

    public void setbytesRAM(long bytesRAM) {
        this.bytesRAM = bytesRAM;
    }
    
    @Override
    public String toString() {
        return "\nEspecificaciones de la Computadora: "+ "\n" + "Distribuidor= " + getdistribuidor() + "\n" +
                "NumeroSerie= " + getnumSerie() + "\n" +
                "Marca= " + getMarca() + "\n" +
                "Nombre= " + getNombre() + "\n" +
                "Costo= " + getprecio() + "\n" + cpu + "\n" +
                "bytesRAM= " + bytesRAM;
                
    }
}