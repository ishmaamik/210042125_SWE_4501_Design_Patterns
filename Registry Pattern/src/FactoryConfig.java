import java.rmi.registry.Registry;

public class FactoryConfig {

    public static void regFactory(FactoryRegistry reg)
    {
        reg.registerFactory("Circle", new CircleFactory());
        //new CircleFactory() because without any instance of it not
        //apt
        reg.registerFactory("Triangle", new TriangleFactory());
    }
}
