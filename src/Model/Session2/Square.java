package Model.Session2;

public class Square extends Shape {
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
