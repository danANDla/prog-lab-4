package persons;

import enums.location;

import java.util.Objects;

public abstract class person {
    private final String name;
    private location located;
    private boolean knowOthers = false;

    public person(String name, location place) {
        this.name = name;
        this.located = place;
    }

    public person(String name) {
        this.name = name;
        this.located = location.DEFAULT;
    }

    public person() {
        this.name = "Noname";
        this.located = location.DEFAULT;
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

    public boolean isKnowOthers() {
        return knowOthers;
    }

    public void setKnowOthers(boolean knowOthers) {
        this.knowOthers = knowOthers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return knowOthers == person.knowOthers && name.equals(person.name) && located == person.located;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, located, knowOthers);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", located=" + located +
                ", knowOthers=" + knowOthers +
                '}';
    }
}
