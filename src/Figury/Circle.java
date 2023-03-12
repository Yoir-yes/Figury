package Figury;

public class Circle implements Figure{
    private double promien;

    public Circle(double promien){
        this.promien = promien;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double getArea() {
        return Math.PI * promien;
    }

    @Override
    public String getType() {
        return "Koło";
    }
}
