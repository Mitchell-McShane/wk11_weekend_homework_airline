import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        Date date = new GregorianCalendar(2021, Calendar.JANUARY, 29).getTime();
        flight = new Flight(new ArrayList<>(), plane, "FR756","GLA","EDI", date);
    }

    @Test
    public void shouldStartWithEmptyBagWeight(){
        assertEquals(0, FlightManager.baggageWeight(flight, 30));
    }

    @Test
    public void shouldFindBaggageWeightPerPerson(){
        assertEquals(441, FlightManager.baggageWeightPerPerson(flight));
    }

    @Test
    public void shouldFindRemainingBaggageWeight(){
        assertEquals(91750, FlightManager.remainBaggageWeight(flight));
    }

}
