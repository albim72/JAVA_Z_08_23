package marcin.com.cars;

import marcin.com.components.Engine;
import marcin.com.components.GPSNavigator;
import marcin.com.components.TripComputer;
import marcin.com.components.Transmission;
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
    
    public String print(){
        String info = "";
        info = info + "Typ smochodu: " + String.valueOf(this.carType) + "\n";
        info = info + "Liczba siedzeń: " + this.seats + "\n";
        info = info + "Silnik: pojmeność -  " + this.engine.getVolume() + ", odległość - " 
                + this.engine.getMileage() +"\n";
        info = info + "Rodzaj skrzyni biegów: " + String.valueOf(this.transmission) + "\n";
        if(this.tripComputer != null)
            info = info + "Komputer pokładowy: Włączony \n";
        else
            info = info + "Komputer pokładowy: N/A \n";

        if(this.gpsNavigator != null)
            info = info + "Nawigacja: Włączony \n";
        else
            info = info + "Nawigacja: N/A \n";
        return info;
    }
}
