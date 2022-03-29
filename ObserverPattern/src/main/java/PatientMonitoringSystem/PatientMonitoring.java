package PatientMonitoringSystem;

import java.util.ArrayList;
import java.util.List;

public class PatientMonitoring implements Subject {
    private int patientPosition;
    private int bloodPressure;
    private int oximetry;

    private static int maxBloodPressure = 143;
    private static int maxOximetry = 87;

    private List<Observer> observers = new ArrayList<>();

    public PatientMonitoring(int num, int bloodPress, int oxy) {
        this.patientPosition = num;
        this.bloodPressure = bloodPress;
        this.oximetry = oxy;
    }

    public void setPosition(int patientPosition) {
        this.patientPosition = patientPosition;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;

        if(bloodPressure > maxBloodPressure) {
            this.notifyObserver(Problem.BLOOD_PRESSURE);
        }
    }

    public void setPulseOximetry(int oximetry) {
        this.oximetry = oximetry;

        if(oximetry > maxOximetry)
            this.notifyObserver(Problem.OXYMETRIE);
    }

    public int getPatientPosition() {
        return patientPosition;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getOximetry() {
        return oximetry;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(Problem pb) {
        for(Observer o : observers) {
            o.update(pb);
        }
    }
}
