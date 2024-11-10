package Service.Session2;

public class AreaCalculatorService<T extends ShapeService> {
    public static double totalArea = 0;

    public void add(T shape){
        totalArea += shape.area();
    }
    public double area(){
        System.out.println(totalArea);
        return totalArea;
    }
}
