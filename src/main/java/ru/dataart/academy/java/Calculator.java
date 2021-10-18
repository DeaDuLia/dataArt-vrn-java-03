package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    public double sumOfSquares(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) {
            res += figure.calculateSquare();
        }
        return res;
    }
}
