public class Sensor extends ComponenteElectronico
{
    protected final String tipo;
    protected final String unidadDeMedida;
    protected final int valor;

    public Sensor(String fabricante, String numSerie, String marca, String nombre, DispositivoElectronico esParteDe, String tipo, String unidadDeMedida, int valor)
    {
        super(fabricante, numSerie, marca, nombre, esParteDe);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }
    
    public Sensor(String fabricante, String numSerie, String marca, String nombre, String tipo, String unidadDeMedida, int valor)
    {
        super(fabricante, numSerie, marca, nombre);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo(){
        return this.tipo;
    }
    
    public String getUnidadDeMedida(){
        return this.unidadDeMedida;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    @Override
    public String toString() {
        return "\nCaracteristicas del Sensor: " + "\n" + 
                "Tipo=" + tipo + "\n"  +
                "Unidad de Medida= " + unidadDeMedida +  "\n"  +
                "Distribuidor= " + distribuidor + "\n"  +
                "Numero de Serie= " + numSerie + "\n"  +
                "Marca= " + marca + "\n"  +
                "Nombre= " + nombre + "\n";
    }
    
}