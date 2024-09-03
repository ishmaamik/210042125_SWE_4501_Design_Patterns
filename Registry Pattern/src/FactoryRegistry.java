import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {

    public Map<String, ShapeFactory> registry= new HashMap<>();

    public void registerFactory(String shapeType, ShapeFactory factory)
    {
        registry.put(shapeType.toUpperCase(), factory);
    }

    public Shape createShape(String shapeType) {
        ShapeFactory sf = registry.get(shapeType.toUpperCase());
        if (sf != null) {
            return sf.createShape();
        }
        else return null;
    }
}
