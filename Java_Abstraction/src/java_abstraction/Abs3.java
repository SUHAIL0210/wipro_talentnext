
package java_abstraction;

public class Abs3 {
    private double height;
    private double width;
    private double breadth;


    public Abs3(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

   
    public Abs3() {
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Optional: Override toString() for easy display
    @Override
    public String toString() {
        return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
    }
}