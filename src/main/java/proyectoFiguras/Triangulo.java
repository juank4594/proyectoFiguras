package proyectoFiguras;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 5/08/13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class Triangulo extends Figura{

    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularAreaT(){
        double areaT= (base*altura)/2;
        setArea(areaT);
    }

    public void calcularPerimetroT(){
        double perimetroT= base+lado2+lado3;
        setPerimetro(perimetroT);
    }
}
