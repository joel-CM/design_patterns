package main.builder;

public class SoccerPlayer {
    private String name;
    private String position;
    private int shirtNumber;

    public SoccerPlayer() {
    }

    public SoccerPlayer(String name, String position, int shirtNumber) {
        this.name = name;
        this.position = position;
        this.shirtNumber = shirtNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public static SoccerPlayerBuilder builder() {
        return new SoccerPlayerBuilder();
    }

    @Override
    public String toString() {
        return "SoccerPlayer [name=" + name + ", position=" + position + ", shirtNumber=" + shirtNumber + "]";
    }
}
