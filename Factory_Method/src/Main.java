public class Main {
    public static void main(String[] args) {

        ShapeFactory sf= new ShapeFactory();

        Shape s1= sf.createShape("Triangle");
        //Reference type is shape but sf.createShape returns object
        //of Triangle that implements the Shape interface so
        //reference type can be shape.
        s1.draw();

        //Suppose an airport ticket center. The shapeType will be the route I want to go to, suppose Palestine to Bangladesh, now I don't have to worry whichever plane I'm given, the ticket center will manage the plane according to the plane routes. Instead of "Circle", I write "Palestine-to-Bangladesh" I'm given Crescent Airlines that travels from Bangladesh Palestine vice versa. The ticket finding and creating is done by the factory class right?

    }
}