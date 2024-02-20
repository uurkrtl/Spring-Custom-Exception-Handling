## Coding: Error Message

* Create a record `ErrorMessage` to send an error message to the client.

## Coding: Exception Handling

Use this example [project](https://github.com/Flooooooooooorian/Spring-Exception-Handling-task) and add appropriate exception handling.

* Implement a local exception handler for the endpoints `getCarBrand` and `getAnimalSpecies`.

## Coding: Global Exception Handling

* Create a `GlobalExceptionHandler` that handles the exception uniformly for the endpoints `getAllAnimals` and `getAllCars`.

## Coding: Integration Tests

* Implement integration tests to verify if the exception is handled correctly.

## Coding: Global Exception Handling

You are really fast! If you like, you can work on this voluntary bonus task.

* Create a global exception handler to catch all standard exceptions of Java (e.g. NullPointerException).

## Bonus

* Add the timestamp of the error to your `ErrorMessage` object.

## Bonus: Product Repository

* Create an ExceptionHandler in your Product Repository to return an appropriate error message to the client in case they request a product that does not exist.

## Bonus: Custom Exception

* Create your own Exception class for the case when the requested product does not exist. Think of a suitable class name.
* Adjust your Exception Handling accordingly.