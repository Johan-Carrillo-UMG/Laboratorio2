package com.geometricFigures;

import java.util.*;

public abstract class Sides implements geometricFigures {
    
    String colorB = "" ;
    String colorF = "" ;
    
    public Sides() {
    }

    public int getSides() {
        // TODO implement here
        return 0;
    }

    public void setSides(int sides) {
        // TODO implement here
    }

    public void setBorderColor() {
        Scanner colorBorde = new Scanner (System.in);
        System.out.print("Ingrese el color de borde: ");
        colorB = colorBorde.nextLine();
    }

    public void setBackgroundColor() {
        Scanner colorFondo = new Scanner (System.in);
        System.out.print("Ingrese el color de fondo: ");
        colorF = colorFondo.nextLine();
    }

}