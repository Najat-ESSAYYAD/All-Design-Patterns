package org.example;

public class StrategyImpl3 extends DefaultStrategyImpl implements Strategy{
    @Override
    public void operationStrategy() {
        super.operationStrategy();
        System.out.println("    .....Strategy 3.....    ");
    }
}
