package things;

import enums.location;

public abstract class thing {
    private final String name;
    private location located;

    public thing(String name, location located) {
        this.name = name;
        this.located = located;
    }

    public thing(String name) {
        this.name = name;
        this.located = location.DEFAULT;;
    }

    public thing() {
        this.name = "undefined";
    }

    public String getName() {
        return name;
    }

    public location getLocated() {
        return located;
    }

    public void setLocated(location located) {
        this.located = located;
    }
}
