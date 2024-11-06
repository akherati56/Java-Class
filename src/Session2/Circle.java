package Session2;

public class Circle extends Shape {
    private final double radius;

    public Circle(){
        radius = 5;
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
        return area;
    }
}
