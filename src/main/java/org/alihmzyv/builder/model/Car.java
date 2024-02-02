package org.alihmzyv.builder.model;

import org.alihmzyv.builder.constant.CarType;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator, double fuel) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
        this.fuel = fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public static class CarBuilder {
        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;
        private double fuel = 0;

        public CarBuilder carType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder tripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public CarBuilder gpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarBuilder fuel(double fuel) {
            this.fuel = fuel;
            return this;
        }

        public Car build() {
            return new Car(this.carType, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator, this.fuel);
        }
    }
}
