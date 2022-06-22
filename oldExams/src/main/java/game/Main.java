package game;

import game.Context.ValaisGame;
import game.Invoker.MenuInvoker;
import game.Strategy.StrategyNax;
import game.Strategy.StrategyNendaz;
import game.Strategy.StrategySimplon;

public class Main {
    public static void main(String[] args) {
        ValaisGame myGame = new ValaisGame();
        myGame.setGameStragegy(new StrategyNax());
        MenuInvoker menuInvoker = new MenuInvoker(myGame);
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategyNendaz());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
        myGame.setGameStragegy(new StrategySimplon());
        menuInvoker.callItem(2);
        menuInvoker.callItem(1);
        menuInvoker.callItem(0);
    }
}