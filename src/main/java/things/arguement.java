package things;

public class arguement {
    private int argueTimes;
    private String topic;

    public arguement(String topic) {
        this.argueTimes = 0;
        this.topic = topic;
    }

    public arguement() {
    }

    public int getArgueTimes() {
        return argueTimes;
    }

    public void setArgueTimes(int argueTimes) {
        this.argueTimes = argueTimes;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
