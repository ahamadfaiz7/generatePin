This project provides a very simple application to generate a batch of Unique 4 digit pins based on the inputted number
of pins to be generated. The project has maven based structure and will be compiled to a jar, and the jar can be used
anywhere else as a dependency to utilize the function to generate pins. The class which has the logic to generate pins
implements an Interface which may have more methods in future to be implemented. The actual logic sits inside the
class **_RandomPinGeneratorImpl_**

Test cases are written to ensure :
------------------------------------
1. The number of pins generated as expected.
2. The pins in the list are not duplicate.
3. The pins have all size 4.


Steps to use the application as a library outside the project
------------------------------------------

1. Build the project using maven clean install
2. A jar will be generated with the name : _**generatePin-1.0.jar**_ in the target folder.
3. Place this jar in any other different project's build path as an external library.
    Import the below from the added jar(
   **_import com.generate.pin.PinGenerator; import com.generate.pin.RandomPinGeneratorFactory;)_**
4. Call the exposed public RandomPinGeneratorFactory from the library to get the instance of the Pin generator method
   PinGenerator generator = RandomPinGeneratorFactory.createRandomPinGeneratorImpl();
5. The list will be returned with Unique 4 digit pins based on the number of pins you require. 
     List<Integer>generatedPinFromApi = generator.generateRandomUniquePins(numberOfPins);


Steps to demonstrate how the pins are generated from a client within the application
-------------------------------------------------------------------------------------
Run the main class **_FetchAndDisplayGeneratedPinsClient_** within the application and view the generated pins in the
console.