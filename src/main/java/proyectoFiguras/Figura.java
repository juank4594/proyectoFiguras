package proyectoFiguras;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 5/08/13
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class Figura implements FiguraCalculable{

    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {

        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        return getPerimetro();
    }
}
