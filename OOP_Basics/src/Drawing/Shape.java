package Drawing;

public abstract class Shape {
    public abstract void draw();

    //An abstract class cannot be instantiated or abstract class
    //cannot have objects of its own
    //It needs to be extended/inherited by some other class

    //An abstract method does not have details written within
    //rather the child classes must override (or overwrite) the
    //details.

    private void write()
    {
        System.out.println("Wrote a letter");
    }

    protected void see()
    {
        System.out.println("Okas");
    }
    //a non-abstract class can be overridden too which is
    //called run-time polymorphism.
}
