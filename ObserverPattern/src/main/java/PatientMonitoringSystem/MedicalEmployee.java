package PatientMonitoringSystem;

public class MedicalEmployee implements Observer{
    PatientMonitoring patient;
    private String name ;

    public MedicalEmployee(String name, PatientMonitoring patient) {
        this.patient = patient;
        this.name = name;

        patient.registerObserver(this);
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public void update(Problem pb) {
        int pbValue = 0 ;
        if(pb == Problem.BLOOD_PRESSURE)
            pbValue = this.patient.getBloodPressure();
        else if(pb == Problem.OXYMETRIE)
            pbValue = this.patient.getOximetry();
        else
            System.exit(-1);

        System.out.println(this.name+ " was notified : Problem for patient "
                                            +this.patient.getPatientPosition() +", "
                                            +pb +" reaches " +pbValue);
    }



}
