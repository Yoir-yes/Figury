import Figury.Circle;
import Figury.Figure;
import Figury.Rectangle;
import Figury.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figury = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        figury[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj a i b trójkąta");
        figury[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Podaj a i b prostokąta");
        figury[2] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        for (Figure f : figures) {
            System.out.println(" ");
            System.out.println(f.getType());
            System.out.println("Pole: " + f.getArea());
            System.out.println("Obówd: " + f.getPerimeter());
        }
    }
}
