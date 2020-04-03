package com.github.matchane.models;

/**
 * Class representing BMW car models
 */
public class BMW {
    public static String MANUFACTURER = "BMW";

    private String modelId;
    private int year;
    private String engine;
    private String transmission;
    private int doors;

    /**
     * this is a parametered constructor, used to create objects easier.<br>
     * You can as many constructors as you need, but they need to have different method signatures (different parameters)
     *
     * @param modelId      the car model's Id
     * @param year         the manufacturing year
     * @param engine       the engine type
     * @param transmission the transmission type
     * @param doors        the number of doors
     */
    public BMW(String modelId, int year, String engine, String transmission, int doors) {
        this.modelId = modelId;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.doors = doors;
    }

    /**
     * This method exists by default in all Java Objects, we override/implement it to help us print the object data.
     *
     * @return A String representation of the object data
     */
    @Override
    public String toString() {
        return "BMW{" +
                "manufacturer='" + BMW.MANUFACTURER + '\'' +
                "modelId='" + modelId + '\'' +
                ", year='" + year + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", doors=" + doors +
                '}';
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
