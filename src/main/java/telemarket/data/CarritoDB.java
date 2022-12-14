package telemarket.data;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class CarritoDB {
    
    //Busca en la base de datos un carrito y lo devuelve
    public static Carrito getCarrito(int nCarrito){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto pollo = new Producto(2,"Pollo","Carne","medio kg de pechugas",4.50);
        Producto pan = new Producto(3,"Pan","Panaderia","Barra de pan",0.40);
        ArrayList<Producto> productos = new ArrayList();
        productos.add(leche);
        productos.add(pollo);
        productos.add(pan);
        Carrito carrito = new Carrito(1,productos,5.79);
        return carrito;
    }
}
