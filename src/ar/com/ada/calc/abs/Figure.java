package ar.com.ada.calc.abs;

import java.util.Objects;

public abstract class Figure {
    public Double area;

    public Figure(){ }
    public Figure(Double area){
        this.area = area;
    }
    public Double getArea(){
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    public abstract void areaCalculator();

    @Override
    public int hashCode(){
        return -2 * Objects.hash(this.area);
    }
    @Override
    public String toString(){
        return "Figure {area = " + this.area + "}";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Figure that = (Figure) obj;
        return this.area.equals(that.area);

    }
}
