package Service.Session2;

public class SquareService extends ShapeService {
    private double side;

    public SquareService() {
        side = 3;
    }

    @Override
    public double area() {
        double area = side * side;
        System.out.println("Area of square is: " + area);
        return area;
    }
}
