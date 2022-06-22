package Observer_Base;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    int state = 0;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o) ;
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        if(state > 100)
            this.notifyObserver();
    }
}
