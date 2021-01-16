package entity;

import java.util.ArrayList;
import java.util.List;

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

    public Double calculateDiscriminant() {
        assert a != 0;
        return b * b - (4 * a * c);
    }

    public Double calculateFirstRoot() {
        assert a != 0;
        return (-b + Math.sqrt(calculateDiscriminant())) / (2 * a);
    }

    public Double calculateSecondRoot() {
        assert a != 0;
        return (-b - Math.sqrt(calculateDiscriminant())) / (2 * a);
    }

    public List<Double> calculateRoots() {
        List<Double> roots = new ArrayList<>();
        assert a != 0;
        if (calculateDiscriminant() > 0) {
            roots.add(calculateFirstRoot());
            roots.add(calculateSecondRoot());
        } else if (calculateDiscriminant() == 0) {
            roots.add(calculateFirstRoot());
        }
        return roots;
    }

    @Override
    public String toString() {
        return String.format("QuadraticEquation{roots=%s}", roots);
    }
}