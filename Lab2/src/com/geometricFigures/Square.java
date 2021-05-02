package com.geometricFigures;

import java.util.*;

public class Square extends Sides {
    
    Sides sides = new Sides() {};
    private int lado;
    String unidadMedida = "" ;

    public Square() {
        Scanner entradaMedida = new Scanner (System.in);
        System.out.print("Ingrese la unidad de medida: ");
        unidadMedida = entradaMedida.nextLine ();
        
        Scanner Medida = new Scanner (System.in);
        System.out.print("Ingrese el tamaño de los lados en " + unidadMedida + " : ");
        lado = Medida.nextInt();
        
        sides.setBorderColor();
        sides.setBackgroundColor();
        this.calculateArea(lado);
        this.calculatePerimeter(lado);
        
        for(int dibujo=0; dibujo<=6; dibujo++){
            System.out.print("*");
        }
        
        System.out.print("\n");
        
        for(int dibujo=0; dibujo<=1; dibujo++){
            System.out.println("*     *");
        }
        
        for(int dibujo=0; dibujo<=6; dibujo++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public void calculateArea(int area) {
        area = lado*lado;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter(int perimeter) {
        perimeter = lado*4;
        System.out.println("Perimetro: " + perimeter);
    }

}