package telemarket.data;

import java.util.ArrayList;
/**
 *
 * @author Miguel
 */
public class ProductoDB {
    
    //Busca en la base de datos un producto y lo devuelve
    public static Producto getProducto(int nProducto){
        Producto producto = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        return producto;
    }

    
    //Recoge de la base de datos todos los productos y los devuelve
    public static ArrayList<Producto> getAllProductos(){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto pollo = new Producto(2,"Pollo","Carne","medio kg de pechugas",4.50);
        Producto pan = new Producto(3,"Pan","Panaderia","Barra de pan",0.40);
        Producto manzanas = new Producto(4,"Manzanas","Fruta","medio kg de manzanas",1.50);
        Producto yogures = new Producto(5,"Yogures","Lacteos","6 yogures naturales",2.00);
        ArrayList<Producto> productos= new ArrayList();
        productos.add(leche);
        productos.add(pollo);
        productos.add(pan);
        productos.add(manzanas);
        productos.add(yogures);
        return productos;
    }
    
    //Recoge de la base de datos todos los productos de una categoria
    public static ArrayList<Producto> getProductos(String categoria){
        Producto leche = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto yogures = new Producto(5,"Yogures","Lacteos","6 yogures naturales",2.00);
        ArrayList<Producto> productos= new ArrayList();
        productos.add(leche);
        productos.add(yogures);
        return productos;
    }
    
    //Busca en la base de datos una lista de productos por el nombre
    public static ArrayList<Producto> getProductosPorNombre(String nombre){
        Producto lecheEnt = new Producto(1,"Leche","Lacteos","6 cartones de leche entera",0.89);
        Producto lecheSem = new Producto(6,"Leche","Lacteos","6 cartones de leche semi",0.89);
        Producto lecheDes = new Producto(7,"Leche","Lacteos","6 cartones de leche desnatada",0.89);
        ArrayList<Producto> productos= new ArrayList();
        productos.add(lecheEnt);
        productos.add(lecheSem);
        productos.add(lecheDes);
        return productos;
    }
    
    public static ArrayList<Producto> getProductoNotExist(String nombre){
        ArrayList<Producto> producto= new ArrayList();    
        return producto;
    }
 
}
