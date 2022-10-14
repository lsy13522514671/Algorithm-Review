package designPattern;

interface IStrategy {
    public void useStrategy();
}

class ConcreteStrategy1 implements IStrategy {

    @Override
    public void useStrategy() {
        System.out.println("concrete strategy 1!");
    }
}

class ConcreteStrategy2 implements IStrategy {

    @Override
    public void useStrategy() {
        System.out.println("concrete strategy 2!");
    }
}

class ConcreteStrategy3 implements IStrategy {

    @Override
    public void useStrategy() {
        System.out.println("concrete strategy 3!");
    }
}

class Context {
    private IStrategy strategy = null;

    public void useStrategy() {
        this.strategy.useStrategy();
    }
}
