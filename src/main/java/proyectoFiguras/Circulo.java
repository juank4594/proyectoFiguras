package proyectoFiguras;

import sun.nio.cs.ext.MacThai;

/**
 * Created with IntelliJ IDEA.
 * User: jucagut94
 * Date: 5/08/13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularAreaR(){
        double areaR= Math.pow(radio,2)*Math.PI;
        setArea(areaR);
    }

    public void calcularPerimetroR(){
        double perimetroR= radio*2*Math.PI;
        setPerimetro(perimetroR);
    }
}
