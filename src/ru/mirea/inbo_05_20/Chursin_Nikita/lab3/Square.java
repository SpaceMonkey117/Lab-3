package ru.mirea.inbo_05_20.Chursin_Nikita.lab3;

public class Square extends Rectangle{

    public Square(){
        setSide(1.0);
        setColor("NONE");
        setFilled(false);
    }

    public Square(double side){
        setSide(side);
        setColor("NONE");
        setFilled(false);
    }

    public Square(double side, String color, boolean filled){
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side){
        width = side;
    }

    @Override
    public void setLength(double side) {
        length = side;
    }

    @Override
    public String toString(){
        return "Square{"
                + "color='" + this.getColor() + '\''
                + ", filled=" + this.isFilled()
                + ", length=" + this.getLength()
                + ", width=" + this.getWidth()
                + ", area=" + this.getArea()
                + ", perimeter=" + this.getPerimeter()
                + '}';
    }
}
