package com.geometricFigures;

import java.util.*;

public class makeFigure {

    public makeFigure() {
    }

    public geometricFigures getFigure(String typeFigure) {
        // TODO implement here
        switch(typeFigure.toUpperCase()){
            case "CIRCLE": return new Circle();
            case "SQUARE": return new Square();
            case "TRIANGLE": return new Triangle();
                
        }
        return null;
    }

}