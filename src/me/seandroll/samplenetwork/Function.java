package me.seandroll.samplenetwork;

public class Function {
    private final int MAX_RECURSIONS = 100000;
    private final double INTEGRATION_CONSTANT = .001;
    private double weight;
    private double constant;

    public Function(double weight) {
        this.weight = weight;
        double sum = 0.0;
        for(double i = 0; i < 1; i+=INTEGRATION_CONSTANT) {
            double value = polynomial(i) + weight;
            sum += value;
        }
        this.constant = (1-sum)*INTEGRATION_CONSTANT;
    }

    public static double polynomial(double value) {
        double numerator = Math.pow(value, 3) + 3*value;
        double denominator = Math.pow(value, 4) + 2;
        return numerator/denominator;
    }

    public double integrate(double b) {
        double sum = 0.0;
        for(double i = 0; i < b; i+=INTEGRATION_CONSTANT) {
            double value = polynomial(1) + this.weight+this.constant;
            sum += value;
        }
        return sum;
    }

    public void alterWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double getConstant() {
        return constant;
    }
}
