package com.geometricFigures;

import java.util.*;

public class Circle implements geometricFigures {
    
    Sides sides = new Sides() {};
    
    private int radius;
    String unidadMedida = "" ;
    private double pi = 3.141594;
    
    public Circle() {
        Scanner entradaMedida = new Scanner (System.in);
        System.out.print("Ingrese la unidad de medida: ");
        unidadMedida = entradaMedida.nextLine ();
        
        Scanner Medida = new Scanner (System.in);
        System.out.print("Ingrese el radio en " + unidadMedida + " : ");
        radius = Medida.nextInt();
        
    }

    public void calculateArea(double area) {
        area = pi * (radius*radius);
        System.out.println("Area: " + area + " " + unidadMedida );
    }

    public void calculatePerimeter(double perimeter) {
        perimeter = 2 * pi * radius;
        System.out.println("Perimetro: " + perimeter + " " + unidadMedida );
    }

    public void setBorderColor() {
        // TODO implement here
        this.calculateArea(radius);
        this.calculatePerimeter(radius);
        System.out.println("Circulo con borde estandar");
    }

    public void setBackgroundColor() {
        // TODO implement here
    }

}