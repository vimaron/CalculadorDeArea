import ar.com.ada.calc.abs.Figure;
import ar.com.ada.calc.subclass.Circulo;
import ar.com.ada.calc.subclass.Rectangulo;
import ar.com.ada.calc.subclass.Triangulo;

public class App {
    public static void main(String[] args) {
        Figure c1 = new Circulo(2.3, 6.1);
        Figure t1 = new Triangulo(3.5, 8.3, 2.0);
        Figure r1 = new Rectangulo(2.0, 7.5);

        System.out.println("La figura c1 es un " + c1.areaCalculator());
        System.out.println("La figura t1 en un " + t1.areaCalculator());
        System.out.println("la figura r1 es un " + r1.areaCalculator());
    }
}
