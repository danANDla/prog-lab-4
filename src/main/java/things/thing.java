package things;

import enums.location;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        thing thing = (thing) o;
        return name.equals(thing.name) && located == thing.located;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, located);
    }

    @Override
    public String toString() {
        return "thing{" +
                "name='" + name + '\'' +
                ", located=" + located +
                '}';
    }
}
