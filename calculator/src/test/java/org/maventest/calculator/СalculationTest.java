package org.maventest.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class СalculationTest {
    @Test
    void sum(){
        double sum = Сalculation.calculate(19, 25, "add");
        Assertions.assertEquals(44, sum);
    }

    @Test
    void sub(){
        double sub = Сalculation.calculate(19.5, 25, "sub");
        Assertions.assertEquals(-5.5, sub);
    }

    @Test
    void div(){
        double div = Сalculation.calculate(10, 5, "div");
        Assertions.assertEquals(2, div);
    }

    @Test
    void mull(){
        double mull = Сalculation.calculate(19, 25, "mull");
        Assertions.assertEquals(475, mull);
    }


    @Test
    void ZeroDiv(){
        Assertions.assertThrows(ArithmeticException.class, ()-> Сalculation.calculate(1,0,"div"));
    }

}
