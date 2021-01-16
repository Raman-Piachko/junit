package entity;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static validador.QuadraticEquationValidator.validateNotZeroValueA;

public class QuadraticEquation {
    private final Double a;
    private final Double b;
    private final Double c;
    private final List<Double> roots;

    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        roots = calculateRoots();
    }

    public Double getA() {
        return a;
    }

    public Double calculateDiscriminant() {
        return b * b - (4 * a * c);
    }

    public Double calculateFirstRoot() {
        if (validateNotZeroValueA(this)) {
            return (-b + Math.sqrt(calculateDiscriminant())) / (2 * a);
        }
        return NaN;
    }

    public Double calculateSecondRoot() {
        if (validateNotZeroValueA(this)) {
            return (-b - Math.sqrt(calculateDiscriminant())) / (2 * a);
        }
        return NaN;
    }

    public List<Double> calculateRoots() {
        List<Double> roots = new ArrayList<>();
        if (validateNotZeroValueA(this)) {
            if (calculateDiscriminant() > 0) {
                roots.add(calculateFirstRoot());
                roots.add(calculateSecondRoot());
            } else if (calculateDiscriminant() == 0) {
                roots.add(calculateFirstRoot());
            }
        }
        return roots;
    }

    @Override
    public String toString() {
        return String.format("QuadraticEquation{roots=%s}", roots);
    }
}