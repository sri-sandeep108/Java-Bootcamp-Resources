public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }

    public void setCountry(String country) throws IllegalArgumentException {
        if (country == null || country.isBlank())
            throw new IllegalArgumentException("Country cannot be null or blank");
        this.country = country;
    }

    public void setPopulation(long population) throws IllegalArgumentException {
        if (population <= 0l)
            throw new IllegalArgumentException("Population must be greater than 0");
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

}
