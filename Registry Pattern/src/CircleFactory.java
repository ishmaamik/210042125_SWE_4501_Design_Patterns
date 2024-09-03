public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();    //Circle implements Shape so return type Shape
    //return objects must implement Shape
    }
}