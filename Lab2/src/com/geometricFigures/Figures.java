package com.geometricFigures;

public class Figures {

    public Figures() {
    }

    public static void main(String[] args) {
        // TODO implement here
        makeFigure makeFig = new makeFigure();
        
        //1- Círculo con radio 25cm
        System.out.println("CÍRCULO");
        geometricFigures geometricCircle = makeFig.getFigure("circle");
        geometricCircle.setBorderColor();
        System.out.println("\n\n");
        
        //2- Imprimir cuadrado de lado 3cm borde color rojo y fondo azul
        System.out.println("CUADRADO");
        geometricFigures geometricSquare = makeFig.getFigure("Square");
        System.out.println("\n");
        
        //3- Exportar las coordenadas de un cuadrado con lados 100cm, 76cm y 25cm
        System.out.println("TRIANGULO");
        geometricFigures geometricTriangle = makeFig.getFigure("Triangle");
    }

}