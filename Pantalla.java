public class Pantalla extends ComponenteElectronico
{
    protected final int pixelesAncho;
    protected final int pixelesLargo;
    
    public Pantalla(String fabricante, String numSerie, String marca, String nombre, DispositivoElectronico esParteDe, int pixelesAncho, int pixelesLargo){
        super(fabricante, numSerie, marca, nombre, esParteDe);
        this.pixelesAncho = pixelesAncho;
        this.pixelesLargo = pixelesLargo;
    }
    
    public Pantalla(String fabricante, String numSerie, String marca, String nombre,int pixelesAncho, int pixelesLargo){
        super(fabricante, numSerie, marca, nombre);
        this.pixelesAncho = pixelesAncho;
        this.pixelesLargo = pixelesLargo;
    }
    
    public int getpixelesAncho(){
        return this.pixelesAncho;
    }
    
    public int getpixelesLargo(){
        return this.pixelesLargo;
    }
    
    @Override
    public String toString() {
        return "\nEspecificaciones de la Pantalla: " + "\n" + "Distribuidor= " + getdistribuidor() + "\n" +
                "Pixeles de Ancho= " + pixelesAncho + "\n" +
                "Pixeles de Largo= " + pixelesLargo + "\n" +
                "Numero de Serie= " + numSerie + "\n"  +
                "Marca= " + marca + "\n" +
                "Nombre= " + nombre + "\n";
    }
}