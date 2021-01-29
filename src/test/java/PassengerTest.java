import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Mitch", 2);
        Date date = new GregorianCalendar(2021, Calendar.JANUARY, 29).getTime();
        flight = new Flight(new ArrayList<>(), plane, "FR756","GLA","EDI", date);

    }

    @Test
    public void hasName(){
        assertEquals("Mitch", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canGetFlight(){
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

}
