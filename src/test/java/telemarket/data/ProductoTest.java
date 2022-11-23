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
public class ProductoTest {
    
    //Comprueba que devuelve el producto esperado
    @Test
    public void getProducto(){
        Producto productoEsperado = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto productoReal = ProductoDB.getProducto(1);
        assertEquals(productoEsperado,productoReal);
    }

    //Comprueba que devuelve todos los productos
    @Test
    public void getAllProductos(){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto pollo = new Producto(2,"Pollo","Carne","medio kg de pechugas",4.50);
        Producto pan = new Producto(3,"Pan","Panaderia","Barra de pan",0.40);
        Producto manzanas = new Producto(4,"Manzanas","Fruta","medio kg de manzanas",1.50);
        Producto yogures = new Producto(5,"Yogures","Lacteos","6 yogures naturales",2.00);
        ArrayList<Producto> productosEsperados= new ArrayList();
        productosEsperados.add(leche);
        productosEsperados.add(pollo);
        productosEsperados.add(pan);
        productosEsperados.add(manzanas);
        productosEsperados.add(yogures);
        ArrayList<Producto> productosReales = ProductoDB.getAllProductos();
        assertEquals(productosEsperados,productosReales);
    }
    
    //Comprueba que todos los productos de cierta categoria son los esperados
    @Test
    public void getProductos(){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto yogures = new Producto(5,"Yogures","Lacteos","6 yogures naturales",2.00);
        ArrayList<Producto> productosEsperados= new ArrayList();
        productosEsperados.add(leche);
        productosEsperados.add(yogures);
        String categoria = "Lacteos"; 
        ArrayList<Producto> productosReales = ProductoDB.getProductos(categoria);
        assertEquals(productosEsperados,productosReales);
    }
    
    //Comprueba que los productos que devuelve son los esperados
    @Test
    public void getProductosPorNombre(){
        Producto lecheEnt = new Producto(1,"Leche entera","Lacteos","6 cartones de leche entera",0.89);
        Producto lecheSem = new Producto(6,"Leche semi","Lacteos","6 cartones de leche semi",0.89);
        Producto lecheDes = new Producto(7,"Leche desnatada","Lacteos","6 cartones de leche desnatada",0.89);
        ArrayList<Producto> productosEsperados= new ArrayList();
        productosEsperados.add(lecheEnt);
        productosEsperados.add(lecheSem);
        productosEsperados.add(lecheDes);
        String nombre = "Leche";
        ArrayList<Producto> productosReales = ProductoDB.getProductos(nombre);
        assertEquals(productosEsperados,productosReales);
    }
    
    //Comprueba que devuelve un array vacio
    @Test
    public void getProductoNotExist(){
        ArrayList<Producto> productosEsperados= new ArrayList();
        String nombre = "Galletas dinosaurio";
        ArrayList<Producto> productosReales = ProductoDB.getProductoNotExist(nombre);
        assertEquals(productosEsperados,productosReales);
    }
    
}
