
public class Rectangle {
    private double width,length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>=0 && width<=20)
            this.width = width;
        else 
            System.out.println("you entered a wrong input:");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>=0 && length<=20)
            this.length = length;
        else 
            System.out.println("your entered a wrong input:");        
    }
    public double getPerimeter()
    {
        return ((length+width)*2);
    }
    public double getArea()
    {
        return length*width;
    }

    @Override
    public String toString() {
        return "\n\nRectangle" + "\nwidth=" + getWidth() + "\nlength=" + getLength() +"\nperimeter="+getPerimeter()+"\nArea="+getArea();
    }
    
}
