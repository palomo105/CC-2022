package telemarket.controlador;

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
public class CarritoControllerTest {
    
    @Test
    public void precioTotal(){
        Double precioEsperado = 18.34;
        int nCarrito = 1;
        Double precioReal = CarritoController.precioTotal(nCarrito);
        assertEquals(precioEsperado, precioReal);
    }
    
    @Test
    public void aplicaCupon(){
        Double precioEsperado = 15.40;
        int nCarrito = 1;
        String cupon = "cupon10";
        Double precioReal = CarritoController.aplicaCupon(cupon,nCarrito);
        assertEquals(precioEsperado, precioReal);
    }
}
