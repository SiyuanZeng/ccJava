package TCS;

/**
 * Created by SiyuanZeng's on 5/12/2016.
 */

public class Flight {

    private String flightNo;

    private String origin;

    private String destination;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        return !(flightNo != null ? !flightNo.equals(flight.flightNo) : flight.flightNo != null);

    }

    @Override
    public int hashCode() {
        return flightNo != null ? flightNo.hashCode() : 0;
    }
}