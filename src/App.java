import ar.com.ada.calc.abs.Figure;
import ar.com.ada.calc.subclass.Circulo;
import ar.com.ada.calc.subclass.Rectangulo;
import ar.com.ada.calc.subclass.Triangulo;

public class App {
    public static void main(String[] args) {
        Figure c1 = new Circulo(2.3, 6.1);
        Figure t1 = new Triangulo(3.5, 8.3, 2.0);
        Figure r1 = new Rectangulo(2.0, 7.5);

        c1.areaCalculator();
        t1.areaCalculator();
        r1.areaCalculator();
    }
}
