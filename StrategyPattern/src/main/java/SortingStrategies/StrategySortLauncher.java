package SortingStrategies;

public class StrategySortLauncher {
    public static void main(String[] args) {
        StrategySortLauncher launcher = new StrategySortLauncher();
        launcher.test();
    }

    public void test() {
        int[] tab1 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab2 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;
        int[] tab3 = { 99, 11, 2, 33, 12, 1, 0, 99, 34, 35 } ;


        Sorter mySorter = new Sorter(new InsertSort()) ;
        mySorter.sort(tab1);
        mySorter.showVectorData(tab1);

        mySorter.setCurrentStrat(new BubbleSort());
        mySorter.sort(tab2);
        mySorter.showVectorData(tab2);

        mySorter.setCurrentStrat(new SelectionSort());
        mySorter.sort(tab3);
        mySorter.showVectorData(tab3);

    }


}
