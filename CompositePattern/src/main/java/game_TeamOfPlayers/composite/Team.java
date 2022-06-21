package game_TeamOfPlayers.composite;

import game_TeamOfPlayers.component.Playable;

import java.util.ArrayList;
import java.util.List;

public class Team implements Playable {

    private final List<Playable> myPlayers = new ArrayList<Playable>();

    public void add(Playable p){
        myPlayers.add(p);
    }

    public void remove(Playable p){
        myPlayers.remove(p);
    }

    @Override
    public void cry() {
        for (Playable p : myPlayers)
            p.cry();
    }

    @Override
    public void enterField() {
        for (Playable p : myPlayers)
            p.enterField();
    }

    @Override
    public void shoot() {
        for (Playable p : myPlayers)
            p.shoot();
    }

    @Override
    public void simulateInjury() {
        for (Playable p : myPlayers)
            p.simulateInjury();
    }

}
