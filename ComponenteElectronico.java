public abstract class ComponenteElectronico extends DispositivoElectronico
{
    protected DispositivoElectronico esParteDe;
    
    public ComponenteElectronico(String fabricante, String numSerie, String marca, String nombre, DispositivoElectronico esParteDe) {
        super(fabricante,numSerie,marca,nombre);
        this.esParteDe = esParteDe;
    }
    
    public ComponenteElectronico(String fabricante, String numSerie, String marca, String nombre) {
        super(fabricante,numSerie,marca,nombre);
    }

    public void setEsParteDe(DispositivoElectronico esParteDe) {
        this.esParteDe = esParteDe;
    }

    public DispositivoElectronico getEsParteDe() {
        return esParteDe;
    }
    
    @Override
    public String toString() {
        return "ComponenteElectronico{" +
                "esParteDe=" + esParteDe +
                '}';
    }
}