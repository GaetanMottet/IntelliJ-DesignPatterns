package CarFeatures.Components;

public abstract class Car{

    protected String description = "";

    public String getDescription() {
        return this.description;
    };
    public abstract double getCost();
    public abstract int getSecurityLevel();

}
