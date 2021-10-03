package ru.mirea.inbo_05_20.Chursin_Nikita.lab3;

public class Circle extends Shape{

    protected double radius;

    public Circle(){
        setRadius(1.0);
        setColor("NONE");
        setFilled(false);
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public  double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public  double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString(){
        return "Circle{"
                + "color='" + color + '\''
                + ", filled=" + filled
                + ", radius=" + radius
                + ", area=" + this.getArea()
                + ", length=" + this.getPerimeter()
                + '}';
    }
}
