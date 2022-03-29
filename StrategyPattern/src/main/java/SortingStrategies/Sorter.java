package SortingStrategies;

public class Sorter {
    private SortStrat strategy;

    public Sorter(SortStrat strategy) {
        this.strategy = strategy;
    }

    public void setCurrentStrat(SortStrat currentStrat) {this.strategy = currentStrat; }

    public void sort(int[] vect) {strategy.sort(vect);}

    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }

        System.out.println(sb.toString());
    }

}
