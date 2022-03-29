package SortingStrategies;

public class BubbleSort implements SortStrat {

    @Override
    public void sort(int[] vector) {
        int temp;
        int nbrePermutation = -1;
        int nbreIteration   = 0;

        while (nbrePermutation != 0) {
            nbrePermutation = 0;

            for (int i=0; i<vector.length - nbreIteration - 1; i++) {

                if (vector[i] > vector[i + 1]) {
                    nbrePermutation++;
                    temp = vector[i + 1];
                    vector[i+1] = vector[i];
                    vector[i]   = temp;
                }
            }
        }

    }
}
