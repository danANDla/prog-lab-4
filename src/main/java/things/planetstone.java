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
    public void taken(person by, String newLocation) {
        System.out.println("The " + getName() + " was taken by " + by.getName() +
                " from " + getLocated().getPlace() + " and was put to " + newLocation);
        if(Objects.equals(newLocation, "Earth")){
            setLocated(location.EARTH);
        }
        else if (Objects.equals(newLocation, "Moon")){
            setLocated(location.MOON);
        }
        else{
            setLocated(location.DEFAULT);
        }
    }

    @Override
    public String getProperties() {
        return this.properties;
    }

}