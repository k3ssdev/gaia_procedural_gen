package com.gssg;

public class Planet {
    private String name;
    private double mass;
    private double radius;
    private double distanceFromStar;
    private double orbitalPeriod;
    // Otros atributos relevantes de un planeta
    
    // Constructor
    public Planet(String name, double mass, double radius, double distanceFromStar, double orbitalPeriod) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.distanceFromStar = distanceFromStar;
        this.orbitalPeriod = orbitalPeriod;
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double  getMass() {
        return mass;
    }

    public void setMass(double  mass) {
        this.mass = mass;
    }

    public double  getRadius() {
        return radius;
    }

    public void setRadius(double  radius) {
        this.radius = radius;
    }


    public double getDistanceFromStar() {
        return distanceFromStar;
    }

    public void setDistanceFromStar(double distanceFromStar) {
        this.distanceFromStar = distanceFromStar;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }
    
    // Otros métodos relevantes de un planeta
    
    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", distanceFromStar=" + distanceFromStar +
                ", orbitalPeriod=" + orbitalPeriod +
                '}';
    }
}