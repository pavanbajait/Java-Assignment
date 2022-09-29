package assignments.Prob3;

public class Shapes {
    public void area(Circle circle){
        System.out.println("Circle area : "+ circle.radius*circle.radius);
    }
    public void area(Rectangle rectangle){
        System.out.println("Rectangle area : "+ rectangle.length*rectangle.breadth);
    }
    public void area(Square square){
        System.out.println("Square area : "+ 4*square.side);
    }

}
