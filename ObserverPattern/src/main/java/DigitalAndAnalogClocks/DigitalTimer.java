package DigitalAndAnalogClocks;

public class DigitalTimer implements Observer{
    MyTimer timer ;

    public DigitalTimer(MyTimer timer) {
        this.timer = timer;
        timer.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The digital clock reads " +this.timer.getHour() +" hour, " +
                            this.timer.getMinute() +" minutes and " +
                            this.timer.getSecond() +" seconds.");
    }
}
