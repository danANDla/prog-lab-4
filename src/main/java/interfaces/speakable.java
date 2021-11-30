package interfaces;

import exceptions.SpeakOnDiffernetPlanetsException;
import persons.person;

public interface speakable {
    void ask(person otherPerson, String topic) throws SpeakOnDiffernetPlanetsException;
    void share(person otherPerson, String topic);
    void say(String replic);
}
