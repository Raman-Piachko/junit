package validador;

import entity.QuadraticEquation;

public class QuadraticEquationValidator {

    public static boolean validateNotZeroValueA(QuadraticEquation quadraticEquation) {
        return quadraticEquation.getA() != 0;
    }
}