package org.example;

public class Context {
    private Strategy strategy=new DefaultStrategyImpl();
    public void effectuerOperation(){
        System.out.println("******************************");
        strategy.operationStrategy();
        System.out.println("++++++++++++++++++++++++++++++\n");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
