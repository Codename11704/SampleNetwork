package me.seandroll.samplenetwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Neuron {
    private Function function;
    private Set<Neuron> neighbors = new HashSet<>();

    public Neuron(double weight) {
        this.function = new Function(weight);
    }

    public void linkTo(Neuron b) {
        this.neighbors.add(b);
    }

    public void alterWeight(double newWeight) {
        function.alterWeight(newWeight);
    }

    public void sendPulse(double value) {
        double result = function.integrate(value);
        for(Neuron neuron : neighbors) {
            neuron.sendPulse(result);
        }
    }





}
