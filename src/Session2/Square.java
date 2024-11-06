package Session2;

import java.text.DecimalFormat;

public class Square extends Shape{
    private double side;

    public Square() {
        side = 3;
    }

    @Override
    public double area() {
        double area = side * side;
        System.out.println("Area of square is: " + area);
        return area;
    }
}
