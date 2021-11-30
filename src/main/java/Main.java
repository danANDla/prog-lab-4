import enums.location;
import enums.understanding;
import persons.dreamer;
import persons.scientist;
import things.arguement;
import things.planetstone;

public class Main {
    public static void main(String[] args) {
        scientist stark = new scientist("Stark", location.MOON, understanding.DEFAULT);
        scientist expert = new scientist("Expert", location.EARTH, understanding.DEFAULT);
        dreamer dunno = new dreamer("Dunno", location.EARTH);
        planetstone moonit = new planetstone("Moonit", location.EARTH, "antigravity");
        arguement question = new arguement();

        expert.befriend(stark);
        expert.share(stark, "Expert's idea");
        expert.share(stark, "science problem");
        stark.share(expert, "another science problem");

        question = expert.argue(stark, "some very important question");
        while(question.getArgueTimes() < 3){
            expert.share(stark, "his point of view");
            stark.share(expert, "his opinion on this topic");
            question.setArgueTimes(question.getArgueTimes()+1);
        }
        System.out.println("The truth was born");

        expert.explore(moonit, stark);
        dunno.take(moonit, "Moon");
        stark.explore(moonit, expert);
    }
}
