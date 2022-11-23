package telemarket.data;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class CarritoTest {
    
    @Test
    public void getCarrito(){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto pollo = new Producto(2,"Pollo","Carne","medio kg de pechugas",4.50);
        Producto pan = new Producto(3,"Pan","Panaderia","Barra de pan",0.40);
        ArrayList<Producto> productos = new ArrayList();
        productos.add(leche);
        productos.add(pollo);
        productos.add(pan);
        Carrito carritoEsperado = new Carrito(1,productos,5.79);
        Carrito carritoReal = CarritoDB.getCarrito(1);
        assertEquals(carritoEsperado,carritoReal);
        
    }

}
