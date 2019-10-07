package ar.com.ada.calc.subclass;

import ar.com.ada.calc.abs.Figure;

import java.awt.geom.Area;
import java.util.Objects;

public class Circulo extends Figure {
    public Double radio;
    static double PI = 3.14;

    public Circulo(){}
    public Circulo(Double radio){
        this.radio = radio;
    }
    public Circulo(Double area, Double radio){
        super(area);
        this.radio = radio;
    }
    public Double getRadio(){
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String areaCalculator(){
        area = PI * radio * radio;
        return toString();
    }
    @Override
    public int hashCode(){
        return -2 * Objects.hash(this.area, this.radio);
    }
    @Override
    public String toString(){
        return "circulo {area = " + this.area + " radio = " + this.radio + "}";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Circulo that = (Circulo) obj;
        return this.area.equals(that.area) &&
                this.radio.equals(that.radio);

    }
}
