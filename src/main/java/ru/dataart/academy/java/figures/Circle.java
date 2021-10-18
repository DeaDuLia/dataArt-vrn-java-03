package ru.dataart.academy.java.figures;

public class Circle extends Figure{
    public static final double PI = 3.14;
    private double radius = 0;

    public Circle(){ }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateSquare() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
