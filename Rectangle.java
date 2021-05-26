package lab11;

public class Rectangle extends Geometric_shape{
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
