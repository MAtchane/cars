package com.github.matchane;

import com.github.matchane.models.BMW;

/**
 * The project's main class, here we put the main method, the place where the code starts executing
 */
public class Main {

    /**
     * The program's point of entry, our code execution starts here.
     *
     * @param args this is used to pass params to the program on launch
     */
    public static void main(String[] args) {
        BMW[] bmwCars = initBMWCars();

        for (int i = 0; i < bmwCars.length; i++) {
            System.out.println(bmwCars[i]);
        }
    }

    /**
     * Simple method that initialize BMW cars/objects.
     *
     * @return a list of the created BMW cars
     */
    private static BMW[] initBMWCars() {
        BMW[] carsToReturn = new BMW[3];

        // creating the car objects
        BMW m5 = new BMW("M5", 1995, "3.5–3.8 L S38 I6", "5-speed manual", 4);
        BMW x6 = new BMW("X6", 1995, "4.4 L S63 V8-TT (petrol)", "8-speed ZF 8HP automatic", 5);
        BMW m3 = new BMW("M3", 1995, "3.0-3.2 L S50/S52 I6", "5-speed manual", 2);

        // adding them to the cars list
        carsToReturn[0] = m5;
        carsToReturn[1] = x6;
        carsToReturn[2] = m3;

        return carsToReturn;
    }
}
