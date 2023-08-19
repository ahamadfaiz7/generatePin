package com.client.generatedPin;

import com.generate.pin.PinGenerator;
import com.generate.pin.RandomPinGeneratorFactory;

import java.util.Iterator;
import java.util.List;

/**
 * This class is just to demonstrate that how the client will call the function to generate the random pins.
 * This class won't be promoted to the production environment.
 * This is a public main client class within the actual application to demonstrate how the pins are generated.
 */
public class FetchAndDisplayGeneratedPinsClient {

    public static void main(String[] args) {
        generatePins(1000);
    }

    public static void generatePins(int numberOfPins) {
        PinGenerator generator = RandomPinGeneratorFactory.createRandomPinGeneratorImpl();
        List<Integer> generatedPinFromApi = generator.generateRandomUniquePins(numberOfPins);
        System.out.printf("size of the batch of generated pins from the library  is " + generatedPinFromApi.size());
        System.out.printf("\n");
        Iterator<Integer> it = generatedPinFromApi.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.printf("\n");
        }
    }
}
