public class Context {
    private Strategy currenStrategy;

    public Context(Strategy currenStrategy) {
        this.currenStrategy = currenStrategy;
    }


    public void setCurrenStrategy(Strategy currenStrategy) {
        this.currenStrategy = currenStrategy;
    }

    public void doSomJob(){
        currenStrategy.algorithm();
    }

}
