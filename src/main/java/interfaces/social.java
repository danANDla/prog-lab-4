package interfaces;

import persons.person;
import things.arguement;

public interface social {
    arguement argue(person otherPerson, String topic);
    void befriend(person otherPerson);
}
