package marcin.com.builders;

import marcin.com.cars.Car;
import marcin.com.cars.CarType;
import marcin.com.components.Engine;
import marcin.com.components.GPSNavigator;
import marcin.com.components.TripComputer;
import marcin.com.components.Transmission;
public class CarBuilder implements Builder {
    
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarBuilder() {
    }

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }   

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;

    }
    
    public Car getResult(){
        return new Car(this.type, this.seats, this.engine,this.transmission,
                this.tripComputer,this.gpsNavigator);
    }
}
