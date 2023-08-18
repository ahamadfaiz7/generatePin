package com.generate.pin;

import java.util.*;
import java.util.logging.Logger;

/**
 * Class to generate 4 digits unique pins based on the inputted number
 */
class RandomPinGeneratorImpl implements PinGenerator {

    public static final int DIGITS_OF_PIN = 1000;
    public static final int BOUND = 2;
    static Logger log = Logger.getLogger(RandomPinGeneratorImpl.class.getName());


    @Override
    public List<Integer> generateRandomUniquePins(int numberOfRandomPins) {
        Random random = new Random();
        /**
         * Use a hashset to establish that the generated pins are stored as unique numbers
         */
        Set<Integer> generatedUniquePins = new HashSet<>();
        try {
            log.info("generating " + numberOfRandomPins + " pins");
            while (generatedUniquePins.size() < numberOfRandomPins) {
                generatedUniquePins.add((1 + random.nextInt(BOUND)) * DIGITS_OF_PIN + random.nextInt(DIGITS_OF_PIN));
            }
            log.info("generated " + generatedUniquePins.size() + " pins");
        } catch (Exception e) {
            log.info("Error while generating  pin=>" + e.getMessage());
        }
        return new ArrayList<>(generatedUniquePins);
    }
}
