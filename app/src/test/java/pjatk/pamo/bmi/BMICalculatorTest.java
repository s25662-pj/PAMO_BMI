package pjatk.pamo.bmi;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMICalculatorTest {

    @Test
    public void testCalculateBmi() {
        double bmi = BmiUtils.calculateBmi(70, 175);
        assertEquals(22.86, bmi, 0.01);
    }

    @Test
    public void testClassifyBmi() {
        assertEquals("Niedowaga", BmiUtils.classifyBmi(17.0));
        assertEquals("Optimum", BmiUtils.classifyBmi(22.0));
        assertEquals("Nadwaga", BmiUtils.classifyBmi(27.0));
        assertEquals("Otyłość", BmiUtils.classifyBmi(31.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroWeight() {
        BmiUtils.calculateBmi(0, 175);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroHeight() {
        BmiUtils.calculateBmi(70, 0);
    }
}
