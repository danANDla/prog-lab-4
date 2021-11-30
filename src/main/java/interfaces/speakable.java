package interfaces;

import persons.person;

public interface speakable {
    void ask(person otherPerson, String topic);
    void share(person otherPerson, String topic);
}
