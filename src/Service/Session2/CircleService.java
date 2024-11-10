package Service.Session2;

public class CircleService extends ShapeService {
    private final double radius;

    public CircleService(){
        radius = 5;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
        return area;
    }
}
