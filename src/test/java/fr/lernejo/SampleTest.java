package fr.lernejo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

    private Sample sample;

    @BeforeEach
    void setUp() {
        sample = new Sample();
    }

    @Test
    void op() {
        Assertions.assertEquals(
            sample.op(Sample.Operation.ADD, 5, 2),
            7
        );

        Assertions.assertEquals(
            sample.op(Sample.Operation.ADD, 1, -2),
            -1
        );

        Assertions.assertEquals(
            sample.op(Sample.Operation.MULT, 3, 4),
            12
        );

        Assertions.assertEquals(
            sample.op(Sample.Operation.MULT, 4, -2),
            -8
        );
    }

    @Test
    void fact() {
        Assertions.assertEquals(
            sample.fact(3),
            6
        );

        Assertions.assertEquals(
            sample.fact(5),
            120
        );

        Assertions.assertThrows(
            IllegalArgumentException.class,
            () -> sample.fact(-2)
        );
    }

    @AfterEach
    void tearDown() {
        sample = null;
    }
}
