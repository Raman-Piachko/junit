package util;

import entity.QuadraticEquation;
import org.apache.log4j.Logger;

public class QuadraticEquationUtils {
    private static final Logger LOGGER = Logger.getLogger(QuadraticEquationUtils.class);

    public static void printRoots(QuadraticEquation quadraticEquation) {
        LOGGER.info(quadraticEquation.toString());
    }
}