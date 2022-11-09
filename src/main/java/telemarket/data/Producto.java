package telemarket.data;

/**
 *
 * @author Miguel
 */
public class Producto {
    private int nProducto;
    private String nombre;
    private String categoria;
    private String descripcion;
    private Double precio;

    public Producto(){
        this.nProducto=0;
        this.nombre="";
        this.categoria="";
        this.descripcion="";
        this.precio=0.0;
    }
    
    public Producto(int nProducto, String nombre, String categoria, String descripcion, Double precio) {
        this.nProducto = nProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getnProducto() {
        return nProducto;
    }

    public void setnProducto(int nProducto) {
        this.nProducto = nProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
