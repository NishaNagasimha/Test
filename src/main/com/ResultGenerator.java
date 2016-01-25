package com;

public class ResultGenerator {

    private Compute compute;

    public ResultGenerator(Compute compute) {
        this.compute = compute;
    }

    public Integer generateSum(int a, int b) {
        return compute.calculateSum(a, b) + 10;
    }
}
