package persons;

import enums.location;
import things.planetstone;

public class dreamer extends person{
    public dreamer(String name, location place) {
        super(name, place);
    }

    public dreamer(String name) {
        super(name);
    }

    public dreamer() {
    }

    public void take(planetstone moonrock, String to){
        moonrock.taken(this, to);
    }
}
