public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico
{
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numSerie, String marca, String nombre, float precio) {
        super(fabricante, numSerie, marca, nombre, precio);
        this.encendido = false; 
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", encendido: " + encendido;
    }
}