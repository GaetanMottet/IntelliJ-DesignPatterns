package game.Context;

import game.Strategy.StrategyGame;

public  class ValaisGame  {
    public StrategyGame gameStragegy;

    public void setGameStragegy(StrategyGame gameStragegy) {
        this.gameStragegy = gameStragegy;
    }

    public void end() {
        gameStragegy.end();
    }

    public void move() {
        gameStragegy.move();
    }

    public void setWinner(){
        gameStragegy.setWinner();
    }

}
