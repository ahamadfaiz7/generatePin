package com.generate.pin;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Junit tests to verify and validate the generated pins
 */
public class RandomPinGeneratorImplTest {
    private final RandomPinGeneratorImpl randomPinGeneratorImpl = new RandomPinGeneratorImpl();

    @Test
    void testNumberOfPinsGenerated() {
        int numberOfPins = 1000;
        List<Integer> pinsGenerated = randomPinGeneratorImpl.generateRandomUniquePins(numberOfPins);
        assertEquals(numberOfPins, pinsGenerated.size());
    }

    @Test
    void testIfPinsAreUnique() {
        int numberOfPins = 1000;
        List<Integer> pinsGenerated = randomPinGeneratorImpl.generateRandomUniquePins(numberOfPins);
        assertTrue(pinsGenerated.stream().distinct().collect(Collectors.toList()).size() == pinsGenerated.size());
    }

    @Test
    void testIfPinsAreFourDigit() {
        int numberOfPins = 1000;
        List<Integer> pinsGenerated = randomPinGeneratorImpl.generateRandomUniquePins(numberOfPins);
        assertFalse(pinsGenerated.stream().anyMatch(pin -> pin > 9999));
        assertFalse(pinsGenerated.stream().anyMatch(pin -> pin < 1000));
    }
}
