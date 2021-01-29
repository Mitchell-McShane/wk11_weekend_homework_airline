import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;
import java.util.jar.Attributes;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination,
                  String departureAirport, Date departureTime){
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    private ArrayList<Integer> generateRemainingSeatNumbers(){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < getCapacity(); i++){
            result.add(i);
        }
        return result;
    }

    public ArrayList<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public Date getDepartureTime(){
        return departureTime;
    }

    public int getCapacity(){
        return plane.getCapacity();
    }

    public int passengerCount() {
        return passengers.size();
    }

    public int remainingSeats(){
        return this.getCapacity() - this.passengerCount();
    }

}
