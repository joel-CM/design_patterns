package main.builder;

public class SoccerPlayerBuilder {
    private String name;
    private String position;
    private int shirtNumber;

    public String getName() {
        return name;
    }

    public SoccerPlayerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public SoccerPlayerBuilder position(String position) {
        this.position = position;
        return this;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public SoccerPlayerBuilder shirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
        return this;
    }

    public SoccerPlayer build() {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName(getName());
        soccerPlayer.setPosition(getPosition());
        soccerPlayer.setShirtNumber(getShirtNumber());
        return soccerPlayer;
    }
}
