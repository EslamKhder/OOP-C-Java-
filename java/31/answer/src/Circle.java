public class Circle {

    private double radius;
    private final double BI = 22 / 7;

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(){
        return 2 * BI * radius;
    }
    public double area(){
        return BI * radius * radius;
    }

}
