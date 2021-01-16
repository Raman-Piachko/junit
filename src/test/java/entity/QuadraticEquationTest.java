package entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Double.NaN;

@RunWith(Parameterized.class)
public class QuadraticEquationTest {
    private final Double a;
    private final Double b;
    private final Double c;
    private final Double discriminantExpected;
    private final Double firstRootExpected;
    private final Double secondRootExpected;
    private final Integer numberOfRootsExpected;

    public QuadraticEquationTest(Double a, Double b, Double c, Double discriminantExpected, Double firstRootExpected,
                                 Double secondRootExpected, Integer numberOfRootsExpected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminantExpected = discriminantExpected;
        this.firstRootExpected = firstRootExpected;
        this.secondRootExpected = secondRootExpected;
        this.numberOfRootsExpected = numberOfRootsExpected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.0, 3.0, 1.0, 1.0, -0.5, -1.0, 2},
                {16.0, -8.0, 1.0, 0.0, 0.25, 0.25, 1},
                {9.0, -6.0, 2.0, -36.0, NaN, NaN, 0},
                {-2.0, 0.0, 1.0, 8.0, -0.7071067811865476, 0.7071067811865476, 2},
                {0.0, 0.0, 0.0, 0.0, NaN, NaN, 0},

        });
    }

    @Test
    public void calculateDiscriminant() {
        Assert.assertEquals(discriminantExpected, new QuadraticEquation(a, b, c).calculateDiscriminant());
    }

    @Test
    public void calculateFirstRoot() {
        Assert.assertEquals(firstRootExpected, new QuadraticEquation(a, b, c).calculateFirstRoot());
    }

    @Test
    public void calculateSecondRoot() {
        Assert.assertEquals(secondRootExpected, new QuadraticEquation(a, b, c).calculateSecondRoot());
    }

    @Test
    public void calculateRoots() {
        Assert.assertEquals(numberOfRootsExpected, Integer.valueOf(new QuadraticEquation(a, b, c).calculateRoots().size()));
    }
}