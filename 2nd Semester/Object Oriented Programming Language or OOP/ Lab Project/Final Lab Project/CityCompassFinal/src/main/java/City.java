abstract class City {
    protected String name;

    public City(String name) {
        this.name = name;
    }

    public abstract String getAccommodationDetails();
    public abstract String getPlacesToExploreDetails();
    public abstract String getMarketPlaceDetails();

    public String getCityName() {
        return name;
    }
}