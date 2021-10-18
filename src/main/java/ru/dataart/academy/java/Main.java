package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");
        Calculator calculator = new Calculator();
        Figure[] figures = new Figure[]{
                new Circle(12),
                new Circle(11),
                new Circle(5),
                new Rectangle(5, 2),
                new Rectangle(2, 2)
        };
        System.out.println("Sum of figures squares: " + calculator.sumOfSquares(figures));
    }
}