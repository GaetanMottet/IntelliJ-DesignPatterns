public class Test {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyB());
        context.doSomJob();
        context.setCurrenStrategy(new ConcreteStrategyA());
        context.doSomJob();
    }
}
