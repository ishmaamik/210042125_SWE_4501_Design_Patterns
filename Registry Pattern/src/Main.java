public class Main {
    public static void main(String[] args) {
        FactoryRegistry fr= new FactoryRegistry();
        FactoryConfig.regFactory(fr);   //during runtime the factories must be configured
        //otherwise they are all null.
        Shape s1= fr.createShape("TriaNgLe");
        s1.draw();
    }
}