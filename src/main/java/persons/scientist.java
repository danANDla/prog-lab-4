package persons;

import enums.location;
import enums.understanding;
import interfaces.social;
import interfaces.speakable;
import things.arguement;
import things.planetstone;

public class scientist extends person implements speakable, social {
    private understanding learn;


    public scientist(String name, location place, understanding learn) {
        super(name, place);
        this.learn = learn;
    }

    public scientist(String name, understanding learn) {
        super(name);
        this.learn = learn;
    }

    public scientist(String name, location place) {
        super(name, place);
        this.learn = understanding.DEFAULT;
    }

    public scientist(String name) {
        super(name);
        this.learn = understanding.DEFAULT;
    }

    public understanding getLearn() {
        return learn;
    }

    public void setLearn(understanding learn) {
        this.learn = learn;
    }

    public void explore(planetstone moonrock, scientist otherScientist){
        if(moonrock.getLocated() == getLocated() && getLocated()!= location.DEFAULT){
            this.setLearn(understanding.PRACTICAL);
            System.out.println(getName() + " has practicaly leraned that " + moonrock.getName() + " has " + moonrock.getProperties());
        }
        else if (isKnowOthers()){
            if(otherScientist.getLearn()==understanding.PRACTICAL || otherScientist.getLearn()==understanding.THEORETICAL){
                ask(otherScientist, "moonstone");
                this.setLearn(understanding.THEORETICAL);
                System.out.println(getName() + " has theoretically leraned that " + moonrock.getName() + " has " + moonrock.getProperties());
            }
            else{
                ask(otherScientist, "moonstone");
                System.out.println(getName() + " hasn't succeed in finding any information about " + moonrock.getName());
            }
        }
        else {
            System.out.println(getName() + " hasn't succeed in finding any information about " + moonrock.getName());
        }
    }

    @Override
    public arguement argue(person otherPerson, String topic) {
        System.out.println(getName() + " argued with " + otherPerson.getName() + " about " + topic);
        return new arguement(topic);
    }

    @Override
    public void befriend(person otherPerson) {
        System.out.println(getName() + " made friends with " + otherPerson.getName());
        this.setKnowOthers(true);
        otherPerson.setKnowOthers(true);
    }

    @Override
    public void ask(person otherPerson, String topic) {
        System.out.println(getName() + " asked " + otherPerson.getName() + " about " + topic);
    }

    @Override
    public void share(person otherPerson, String topic) {
        System.out.println(getName() + " shared with " + otherPerson.getName() + " information about " + topic);
    }
}