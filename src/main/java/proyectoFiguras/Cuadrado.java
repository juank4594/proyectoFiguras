package proyectoFiguras;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 5/08/13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calcularAreaC(){
        double areaC= lado*lado;
        setArea(areaC);
    }
    public void calcularPerimetroC(){
        double perimetroR= lado*4;
        setPerimetro(perimetroR);
    }
}
