package com.lld.behavioural.strategy;

public class Calculator {

    private OperationStrategy operationStrategy = null;

    public void setStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int performCalculation(int a, int b) {
        return operationStrategy.operate(a, b);
    }
}
