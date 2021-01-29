import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Mitch", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Mitch", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}
