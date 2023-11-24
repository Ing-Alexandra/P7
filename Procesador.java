public class Procesador extends ComponenteElectronico
{
    protected final int memoriaRAM;
    protected final long ghz;
    
    public Procesador(String fabricante, String numSerie, String marca, String nombre, DispositivoElectronico esParteDe,
                           int memoriaRAM, long ghz) {
        super(fabricante, numSerie, marca, nombre, esParteDe);
        this.memoriaRAM = memoriaRAM;
        this.ghz = ghz;
    }
    
    public Procesador(String fabricante, String numSerie, String marca, String nombre,
                           int memoriaRAM, long ghz) {
        super(fabricante, numSerie, marca, nombre);
        this.memoriaRAM = memoriaRAM;
        this.ghz = ghz;
    }
    
    public int getmemoriaRAM() {
        return memoriaRAM;
    }

    public long getghz() {
        return ghz;
    }

    @Override
    public String toString() {
        return "\nEspecificaciones del Procesador: " + "\n" +
                "MemoriaRAM= " + memoriaRAM + "\n" +
                "Ghz= " + ghz;
    }
}