package assignments.Prob3;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle ckl = new Circle();
        ckl.radius = 12;
        s1.area(ckl);

        Rectangle rct = new Rectangle();
        rct.length = 12;
        rct.breadth = 10;
        s1.area(rct);

        Square sqr = new Square();
        sqr.side = 12;
        s1.area(sqr);
    }
}
