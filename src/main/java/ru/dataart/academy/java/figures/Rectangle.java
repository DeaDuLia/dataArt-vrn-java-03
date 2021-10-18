package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{
    private double width = 0;
    private double height = 0;
    public Rectangle() { }

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateSquare() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
