package proyectoFiguras;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 5/08/13
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
public class FiguraTest {
    public void testGetArea() throws Exception {

    }

    public void testSetArea() throws Exception {

    }

    public void testGetPerimetro() throws Exception {

    }

    public void testSetPerimetro() throws Exception {

    }


    @Test
    public void testCalcularArea() throws Exception {
        Cuadrado c=new Cuadrado(4);
        c.calcularAreaC();
        c.calcularPerimetroC();

        System.out.println("El area es: "+ c.calcularArea());
        System.out.println("El perimetro es: "+ c.calcularPerimetro());
    }

    public void testCalcularPerimetro() throws Exception {

    }
}
