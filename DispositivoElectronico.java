import java.util.ArrayList;

public abstract class DispositivoElectronico
{
    protected final String distribuidor;
    protected final String numSerie;
    protected final String marca;
    protected final String nombre;
    protected float precio;
    protected ArrayList<ComponenteElectronico> componentes;
    
    public DispositivoElectronico(String distribuidor, String numSerie, String marca, String nombre, float precio) {
        this.distribuidor = distribuidor;
        this.numSerie = numSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.componentes = new ArrayList<>();
    }
    
    public DispositivoElectronico(String distribuidor, String numSerie, String marca, String nombre) {
        this.distribuidor = distribuidor;
        this.numSerie = numSerie;
        this.marca = marca;
        this.nombre = nombre;
    }
        
    public String getdistribuidor() {
        return this.distribuidor;
    }

    public String getnumSerie() {
        return this.numSerie;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setprecio(float precio) {
        this.precio = precio;
    }

    public float getprecio() {
        return precio;
    }

    public void agregarComponente(ComponenteElectronico componente) {
        componentes.add(componente);
    }

    public void quitarComponente(ComponenteElectronico componente) {
        componentes.remove(componente);
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }
    
    @Override
    public String toString() {
        return "DispositivoElectronico{" +
                "distribuidor='" + distribuidor + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", componentes=" + componentes +
                '}';
    }
    
    public void hacerClick() {
        System.out.println("Clic en el dispositivo electrónico.");
    }
}