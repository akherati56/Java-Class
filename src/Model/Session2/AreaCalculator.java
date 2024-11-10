package Model.Session2;

public class AreaCalculator<T extends Shape> {
    public static double totalArea = 0;

    public void add(T shape){
        totalArea += shape.area();
    }
    public double area(){
        System.out.println(totalArea);
        return totalArea;
    }
}
