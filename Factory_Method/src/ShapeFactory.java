public class ShapeFactory {

    public Shape createShape(String shapeType)
    {
        if(shapeType==null)
        {
            return null;
        }

        else if (shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }

        else if(shapeType.equalsIgnoreCase("TRIANGLE"))
        {
            return new Triangle();
        }

        else return null;

    }

}
