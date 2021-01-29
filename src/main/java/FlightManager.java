public class FlightManager {

    public static int baggageWeight(Flight flight, int weightPerBag){
        int total = 0;
        for (Passenger passenger : flight.getPassengers()){
            total += passenger.getNumberOfBags();
        }
        return total * weightPerBag;
    }

    public static int baggageWeightPerPerson(Flight flight){
        return flight.getPlane().getTotalWeight() / flight.getCapacity();
    }

    public static int remainBaggageWeight(Flight flight){
        int reservedForBaggageAmount = flight.getPlane().getTotalWeight() / 2;
        return reservedForBaggageAmount - baggageWeight(flight,baggageWeightPerPerson(flight));
    }
}
