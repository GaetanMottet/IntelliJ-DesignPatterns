package DigitalAndAnalogClocks;

public class AnalogTimer implements Observer {
    MyTimer timer ;

    public AnalogTimer(MyTimer timer) {
        this.timer = timer;
        timer.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The analog clock reads " +this.timer.getHour() +" hour, " +
                this.timer.getMinute() +" minutes and " +
                this.timer.getSecond() +" seconds.");
    }
}
