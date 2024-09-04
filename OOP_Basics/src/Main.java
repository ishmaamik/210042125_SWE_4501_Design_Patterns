import Drawing.Circle;

public class Main {
    public static void main(String[] args) {

        Circle c1= new Circle();
        c1.draw();
        c1.writs();
        // c1.write(); will give an error because write is
        //private method for shape/ parent class, so can't
        //be inherited

    }
}