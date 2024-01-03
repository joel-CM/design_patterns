package main;

import main.builder.SoccerPlayer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder pattern");
        SoccerPlayer messi = SoccerPlayer.builder()
                .name("messi")
                .shirtNumber(10)
                .build();

        System.out.println(messi.toString());
    }
}