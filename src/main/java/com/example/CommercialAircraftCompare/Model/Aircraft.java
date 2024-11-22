package com.example.CommercialAircraftCompare.Model;

import lombok.Getter;
import lombok.Setter;

public class Aircraft {
    @Getter @Setter private int id;
    @Getter @Setter private Manufacturer manufacturer;
    @Getter @Setter private double wingSpan;
    @Getter @Setter private double height;
    @Getter @Setter private int allEconomyCapacity;
    @Getter @Setter private double range;
    @Getter @Setter private double fuelCapacity;
    @Getter @Setter private double weight;
    @Getter @Setter private double MOTW;
    @Getter @Setter private double cruiseSpeed;
    @Getter @Setter private int celling;
    @Getter @Setter private double maxSpeed;
    @Getter @Setter private String engines;
    @Getter @Setter private double maxThrust;

    public Aircraft(int id, Manufacturer manufacturer, double wingSpan, int allEconomyCapacity, double range, double fuelCapacity, double weight, double MOTW, double cruiseSpeed, int celling, double maxSpeed, String engines, double maxThrust) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.wingSpan = wingSpan;
        this.allEconomyCapacity = allEconomyCapacity;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.MOTW = MOTW;
        this.cruiseSpeed = cruiseSpeed;
        this.celling = celling;
        this.maxSpeed = maxSpeed;
        this.engines = engines;
        this.maxThrust = maxThrust;
    }
}
