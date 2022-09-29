package assignments.Prob2;

public abstract class Shape {
    public abstract int rectangleArea(int length, int breadth);
    public abstract int squareArea(int side);
    public abstract int circleArea(int radius);

}
class Area extends Shape {
    public int rectangleArea(int length, int breadth){
        return length*breadth;
    }
    public int squareArea(int side){
        return side*side;
    }
    public int circleArea(int radius){
        double x = 3.141*radius*radius;
        return (int)x;
    }
}
class Main {
    public static void main(String[] args) {
        Shape a = new Area();
        int d=a.circleArea(2);
        int b=a.rectangleArea(2, 4);
        int c=a.squareArea(4);
        System.out.println("Area of Circle: "+d);
        System.out.println("Area of rectangle: "+b);
        System.out.println("Area of Square: "+c);
    }
}