public class Context {
    private Strategy strategy = new DefaultStrategyImpl();

    public void applyStrategy() {
        System.out.println("=========================");
        strategy.perform();
        System.out.println("=========================\n");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
