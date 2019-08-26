//Class Adapter Pattern
//In this approach, we use the Java Inheritance and extend the source class.
//So, for this approach, we have to create separate adapters for the Triangle and Rhombus classes,

public class TriangleAdapter extends Triangle implements Shape {
    public TriangleAdapter() {
        super();
    }
    @Override
    public void draw() {
        this.drawShape();
    }
    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }
    @Override
    public String description() {
        return "Triangle object";
    }
    @Override
    public boolean isHide() {
        return false;
    }
}
