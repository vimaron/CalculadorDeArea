package ar.com.ada.calc.subclass;

import ar.com.ada.calc.abs.Figure;

import java.util.Objects;

public class Rectangulo extends Figure {
    public Double baseR;
    public Double alturaR;

    public Rectangulo(){}
    public Rectangulo(Double baseR, Double alturaR){
        this.baseR = baseR;
        this.alturaR = alturaR;
    }
    public Rectangulo(Double area, Double baseR, Double alturaR){
        super(area);
        this.alturaR = alturaR;
        this.baseR = baseR;
    }

    public Double getBase(){
        return baseR;
    }
    public void setBase(Double base) {
        this.baseR = baseR;
    }
    public Double getAltura(){
        return alturaR;
    }
    public void setAltura(Double altura) {
        this.alturaR = alturaR;
    }
    @Override
    public void areaCalculator(){
        area = baseR * alturaR;
        System.out.println("La base del rectangulo es = " + baseR + ", la altura es = " + alturaR +
                " y el area es = " + area);
    }
    @Override
    public int hashCode(){
        return -2 * Objects.hash(this.area, this.baseR, this.alturaR);
    }
    @Override
    public String toString(){
        return "Figure {area = " + this.area + " base = " + this.baseR + " altura = " + this.alturaR + "}";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Rectangulo that = (Rectangulo) obj;
        return this.area.equals(that.area) &&
                this.baseR.equals(that.baseR) &&
                this.alturaR.equals(that.alturaR);

    }
}
