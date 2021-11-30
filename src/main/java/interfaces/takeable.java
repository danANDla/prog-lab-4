package interfaces;

import enums.location;
import persons.person;

public interface takeable {
    void taken(person by, location newLocation);
}
