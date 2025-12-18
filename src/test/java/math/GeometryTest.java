package math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometryTest {

    private Geometry geometry;
    private static final double DELTA = 0.0001;

    @Before
    public void setUp() {
        geometry = new Geometry();
    }

    @Test
    public void testCalculateCircleArea_withValidRadius() {
        double radius = 5.0;
        double expected = Math.PI * 25.0;

        double actual = geometry.calculateCircleArea(radius);

        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateCircleArea_withZeroRadius() {
        double radius = 0.0;
        double expected = 0.0;

        double actual = geometry.calculateCircleArea(radius);

        assertEquals(expected, actual, DELTA);
    }

}
