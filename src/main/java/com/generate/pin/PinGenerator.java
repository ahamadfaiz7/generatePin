package com.generate.pin;

import java.util.List;

/**
 * Public interface used to access the pin generation logic in the implementation class
 */
public interface PinGenerator {

    List<Integer> generateRandomUniquePins(int numberOfRandomPins);
}
