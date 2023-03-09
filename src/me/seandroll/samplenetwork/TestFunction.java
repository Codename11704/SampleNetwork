package me.seandroll.samplenetwork;

import org.junit.jupiter.api.Test;

public class TestFunction {

    @Test
    public void testIntegration() {
        Function function = new Function(.6);
        System.out.println(function.getConstant());
    }
}
