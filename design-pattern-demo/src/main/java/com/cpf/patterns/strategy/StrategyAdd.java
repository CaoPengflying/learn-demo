package com.cpf.patterns.strategy;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class StrategyAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
