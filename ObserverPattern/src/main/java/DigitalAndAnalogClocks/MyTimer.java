package DigitalAndAnalogClocks;

import java.util.*;

public class MyTimer implements ClockTimer, Subject{
    private Calendar cal;
    private Timer timer;

    private List<Observer> observers = new ArrayList<>();

    /**
     * Constructor
     */
    public MyTimer() {
        cal = Calendar.getInstance();
        timer = new Timer();

        timer.schedule(new TimerAction(), 0, 1*1000);
    }

    class TimerAction extends TimerTask {
        public void run() {
            cal = Calendar.getInstance();
            tick();
        }
    }

    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return cal.get(Calendar.SECOND);
    }

    // Gets called by the internal timer every second to provide an accurate time base.
    public void tick() {
        // DO SOMETHING
        for(Observer o : observers) {
            o.update();
        }
    }

    @Override
    public void notifyObserver() {
        this.tick();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
