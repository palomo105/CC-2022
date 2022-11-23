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

    public Carrito(){
        this.nCarrito=0;
        this.listaProductos=null;
        this.precioTotal=0.0;    
    }
    
    public Carrito(int nCarrito, ArrayList listaProductos, double precioTotal) {
        this.nCarrito = nCarrito;
        this.listaProductos = listaProductos;
        this.precioTotal = precioTotal;
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
    
}