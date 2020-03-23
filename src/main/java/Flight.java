import java.util.ArrayList;

public class Flight {

//    private String detail;
    private PlaneType plane;
    private int seating;
    private int planeWeight;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(PlaneType plane, int seating, int planeWeight, String flightNumber, String destination, String departureAirport, String departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
        this.seating = seating;
//        this.planeWeight = new int(String.valueOf(this.plane.getPlaneWeight()));
//        this.detail = new String(this.plane.getPlaneCapacity() + " capacity and a weight of " + this.plane.getPlaneWeight());

    }

    public int passengerListSize(){
        return this.passengers.size();
    }

    public void bookOnAPassenger(Passenger passenger){
        if(this.passengerListSize() < this.seating){
            this.passengers.add(passenger);
        }
    }

    public int getPlaneCapacity(){
        return seating;
    }


//    public String getPlaneDetail(){
//        return detail;
//    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getFlightDestination(){
        return destination;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

}
