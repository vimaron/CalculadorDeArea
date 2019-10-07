package ar.com.ada.calc.subclass;

import ar.com.ada.calc.abs.Figure;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Objects;

public class Triangulo extends Figure {
    public Double baseT;
    public Double alturaT;

    public Triangulo(){}
    public Triangulo(Double baseT, Double alturaT){
        this.baseT = baseT;
        this.alturaT = alturaT;
    }
    public Triangulo(Double area, Double baseT, Double alturaT){
        super(area);
        this.baseT = baseT;
        this.alturaT = alturaT;
    }
    public Double getBaseT(){
        return baseT;
    }
    public void setBaseT(java.lang.Double baseT) {
        this.baseT = baseT;
    }
    public Double getAlturaT(){
        return alturaT;
    }
    public void setAlturaT(java.lang.Double alturaT) {
        this.alturaT = alturaT;
    }
    @Override
    public String areaCalculator(){
        area = (baseT * alturaT) / 2;
        return toString();
    }
    @Override
    public int hashCode(){
        return -2 * Objects.hash(this.area, this.baseT, this.alturaT);
    }
    @Override
    public String toString(){
        return "triangulo {area = " + this.area + " base = " + this.baseT + " altura = " + this.alturaT + "}";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Triangulo that = (Triangulo) obj;
        return this.area.equals(that.area) &&
                this.baseT.equals(that.baseT) &&
                this.alturaT.equals(that.alturaT);

    }
}
