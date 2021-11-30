package enums;

public enum location {
    DEFAULT("somewhere"),
    EARTH("the Earth"),
    MOON("the Moon");

    private  String place;

    location(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}

