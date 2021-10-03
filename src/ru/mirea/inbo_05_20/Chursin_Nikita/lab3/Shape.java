package ru.mirea.inbo_05_20.Chursin_Nikita.lab3;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){
        setColor("NONE");
        setFilled(false);
    }

    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape{"
                + "color='" + color + '\''
                + ", filled=" + filled
                + ", area=" + this.getArea()
                + ", perimeter=" + this.getPerimeter()
                + '}';
    }
}
