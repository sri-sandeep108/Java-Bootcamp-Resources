import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulation;

    public CityPopulationTracker() {
        cityPopulation = new HashMap<>();
    }

    public City getCity(String name) {
        return new City(cityPopulation.get(name));
    }

    public void setCity(City city) {
        cityPopulation.put(city.getName(), new City(city));
    }

    public void addCity(City city) {
        cityPopulation.put(city.getName(), new City(city));
    }
}
