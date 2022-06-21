package game_TeamOfPlayers.component;

public class Player implements Playable{

    private final int name;

    public Player(int name){
        this.name = name;
    }

    @Override
    public void enterField() {
        System.out.println(name +" is entering field");
    }

    @Override
    public void shoot() {
        System.out.println(name +" is shooting");
    }

    @Override
    public void cry() {
        System.out.println(name +" is crying");
    }

    @Override
    public void simulateInjury() {
        System.out.println(name +" is simulating an injury");
    }
}
