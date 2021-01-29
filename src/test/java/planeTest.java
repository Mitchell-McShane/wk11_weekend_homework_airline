import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class planeTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasCapacity(){
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(183500, plane.getTotalWeight());
    }
}
