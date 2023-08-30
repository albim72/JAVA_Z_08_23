package marcin.com.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "ul.Długa 56, Rzeszów";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
