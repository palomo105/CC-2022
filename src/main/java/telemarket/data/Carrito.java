package telemarket.data;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Carrito {
    private int nCarrito;
    private ArrayList listaProductos;
    private double precioTotal;
    private String cupon;

    public Carrito(){
        this.nCarrito=0;
        this.listaProductos=null;
        this.precioTotal=0.0;
        this.cupon="";    
    }
    
    public Carrito(int nCarrito, ArrayList listaProductos, double precioTotal, String cupon) {
        this.nCarrito = nCarrito;
        this.listaProductos = listaProductos;
        this.precioTotal = precioTotal;
        this.cupon = cupon;
    }

    public int getnCarrito() {
        return nCarrito;
    }

    public void setnCarrito(int nCarrito) {
        this.nCarrito = nCarrito;
    }

    public ArrayList getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }
    
    
}
