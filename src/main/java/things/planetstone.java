package things;

import enums.location;
import interfaces.studysample;
import interfaces.takeable;
import persons.person;

import java.util.Objects;

public class planetstone extends planet implements takeable, studysample {

    private String properties;

    public planetstone(String name, location located, String properties) {
        super(name, located);
        this.properties = properties;
    }

    public planetstone() {
    }

    @Override
    public void taken(person by, location newLocation) {
        System.out.println("The " + getName() + " was taken by " + by.getName() +
                " from " + getLocated().getPlace() + " and was put to " + newLocation.getPlace());
        setLocated(newLocation);
    }

    @Override
    public String getProperties() {
        return this.properties;
    }

}