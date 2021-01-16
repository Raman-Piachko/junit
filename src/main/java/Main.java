import entity.QuadraticEquation;

import static util.QuadraticEquationUtils.printRoots;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(81.0, -16.0, -1.0);
        printRoots(quadraticEquation);
    }
}