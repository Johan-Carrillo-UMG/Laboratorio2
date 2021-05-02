package com.geometricFigures;

public class Triangle extends Sides {
    
    private int lado1;
    private int lado2;
    private int lado3;
    String unidadMedida = "" ;
    
    public Triangle() {
        this.calculateArea(lado1);
        this.calculatePerimeter(lado1);
    }

    private int Base;
    private int Height;

    public void calculateArea(int area) {
        area = (Base * Height) / 2;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter(int perimeter) {
        perimeter = 100+76+25;
        System.out.println("Area: " + perimeter);
    }

}