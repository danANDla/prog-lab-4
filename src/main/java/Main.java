import enums.location;
import enums.understanding;
import exceptions.SpeakOnDiffernetPlanetsException;
import interfaces.speakable;
import persons.dreamer;
import persons.person;
import persons.scientist;
import things.planetstone;

public class Main {
    public static void main(String[] args) {
        scientist stark = new scientist("Stark", location.EARTH, understanding.DEFAULT);
        scientist expert = new scientist("Expert", location.EARTH, understanding.DEFAULT);
        dreamer dunno = new dreamer("Dunno", location.EARTH);
        planetstone moonit = new planetstone("Moonit", location.EARTH, "antigravity");


        expert.befriend(stark);
        expert.share(stark, "Expert's idea");
        expert.share(stark, "science problem");
        stark.share(expert, "another science problem");

        speakable author = new speakable() {
            @Override
            public void ask(person otherPerson, String topic) throws SpeakOnDiffernetPlanetsException {
                System.out.print(" \u001B[36m" + otherPerson.getName() + " asked" +  "\u001B[0m");
            }

            @Override
            public void share(person otherPerson, String topic) {
                System.out.print(" \u001B[36m" + otherPerson.getName() + " shared" +  "\u001B[0m");
            }

            @Override
            public void say(String replic) {
                System.out.println("\u001B[36m" + replic +  "\u001B[0m");
            }
        };

        author.say("It often happens with shorties: at first they quarrel and after that they make friends");

        class arguement{
            private final int numberOfReplics;
            private int ArgueTimes;
            private boolean resolved;
            public arguement(){
                this.numberOfReplics = (int) ((Math.random() * 2) + 1);
                this.resolved = false;
                this.ArgueTimes = 0;
            }

            public int getNumberOfReplics() {
                return numberOfReplics;
            }

            public boolean isResolved() {
                return resolved;
            }

            public int getArgueTimes() {
                return ArgueTimes;
            }

            public void setArgueTimes(int argueTimes) {
                ArgueTimes = argueTimes;
                if(ArgueTimes >= numberOfReplics) resolved = true;
            }
        }
        expert.argue(stark, "some very important question");
        arguement question = new arguement();
        while(!question.isResolved()){
            expert.share(stark, "his point of view");
            stark.share(expert, "his opinion on this topic");
            question.setArgueTimes(question.getArgueTimes()+1);
        }
        System.out.println("...and Finally the truth was born");
        stark.say("The truth is born in disputes");
        author.say(" - Stark said");
        expert.explore(moonit, stark);
        dunno.take(moonit, location.MOON);
        stark.explore(moonit, expert);

        System.out.println();
        System.out.println(stark.toString());
        System.out.println(dunno.toString());
        System.out.println(expert.toString());
        System.out.println(moonit.toString());
    }
}
