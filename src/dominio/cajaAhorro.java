package dominio;

public class cajaAhorro {
    
    private double cantidad;
    private String nombre;
    private int codigo;

    public cajaAhorro(double dinero, String nombre, int codigo) {
        this.cantidad = dinero;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public cajaAhorro() {
    }

    
    
    public double getDinero() {
        return cantidad;
    }

    public void setDinero(double dinero) {
        this.cantidad = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
