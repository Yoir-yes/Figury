package Figury;

public class Rectangle implements Figure{

    private double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String Name() {
        return "Prostokąt";
    }
}
