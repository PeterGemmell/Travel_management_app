import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger peter;
    private Passenger adla;

    @Before
    public void before() {
        flight = new Flight(PlaneType.BOEING747, 660, 183500, "FR756", "NAS", "GLA", "7:00am");
        peter = new Passenger("Peter", 2);
        adla = new Passenger("Adla", 4);

    }

    @Test
    public void passengerListSizeStartsAt0(){
        assertEquals(0, flight.passengerListSize());
    }

    @Test
    public void canBookAPassengerIfSeatsRemain(){
        flight.bookOnAPassenger(peter);
        assertEquals(1, flight.passengerListSize());
    }

    @Test
    public void planeCapacity(){
        assertEquals(660, flight.getPlaneCapacity());
        System.out.println("The Boeing 747 has 660 seats.");
    }



//    @Test
//    public void planeCapacityAndWeight() {
//        assertEquals("660 capacity and a weight of 183500", flight.getPlaneDetail());
//    }

    @Test
    public void flightHasANumber() {
        assertEquals("FR756", flight.getFlightNumber());

    }

    @Test
    public void flightHasADestination() {
        assertEquals("NAS", flight.getFlightDestination());
    }

    @Test
    public void flightHasADepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void flightHasADepartureTime() {
        assertEquals("7:00am", flight.getDepartureTime());
    }

//    @Test
//    public void capacityOfPlane() {
//        assertEquals(660, flight.getCapacityOfPlane());
//    }




}
