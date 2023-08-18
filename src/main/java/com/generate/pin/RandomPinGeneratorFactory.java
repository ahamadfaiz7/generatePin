package com.generate.pin;

public class RandomPinGeneratorFactory {

    private RandomPinGeneratorFactory() {
    }

    /**
     * Creates an instance of {@link RandomPinGeneratorImpl}.
     *
     * @return the new instance of RandomPinGeneratorImpl
     */
    public static RandomPinGeneratorImpl createRandomPinGeneratorImpl() {
        return new RandomPinGeneratorImpl();
    }
}
