import enums.location;
import enums.understanding;
import persons.dreamer;
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

        expert.explore(moonit, stark);
        dunno.take(moonit, location.MOON);
        stark.explore(moonit, expert);
    }
}
