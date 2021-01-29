import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;


public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        Date date = new GregorianCalendar(2021, Calendar.JANUARY, 29).getTime();
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(new ArrayList<>(), plane, "FR756","GLA","EDI", date);
    }

    @Test
    public void hasPassengerCount(){
        assertEquals(new ArrayList<Passenger>(), flight.getPassengers());
    }

    @Test
    public void hasEmptyPassengerCount(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        Date date = new GregorianCalendar(2021, Calendar.JANUARY, 29).getTime();
        assertEquals(date, flight.getDepartureTime());
    }

}
