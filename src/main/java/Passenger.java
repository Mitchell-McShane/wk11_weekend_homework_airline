public class Passenger {

    private String name;
    private  int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName(){
        return this.name;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }


}
