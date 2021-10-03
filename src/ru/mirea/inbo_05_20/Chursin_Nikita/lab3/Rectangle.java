package ru.mirea.inbo_05_20.Chursin_Nikita.lab3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle(){
        setWidth(1.0);
        setLength(1.0);
        setColor("NONE");
        setFilled(false);
    }

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
        setColor("NONE");
        setFilled(false);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return getWidth() * getLength();
    }

    public double getPerimeter(){
        return 2 * getWidth() + 2 * getLength();
    }

    @Override
    public String toString(){
        return "Rectangle{"
                + "color='" + this.getColor() + '\''
                + ", filled=" + this.isFilled()
                + ", length=" + this.getLength()
                + ", width=" + this.getWidth()
                + ", area=" + this.getArea()
                + ", perimeter=" + this.getPerimeter()
                + '}';
    }
}
