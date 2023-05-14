package com.gssg;

public class Star {
    private String name;
    private double ra;
    private double dec;
    private double distance;
    // Otros atributos relevantes de una estrella
    
    // Constructor
    public Star(String name, double ra, double dec, double distance) {
        this.name = name;
        this.ra = ra;
        this.dec = dec;
        this.distance = distance;
    }
    
    public Star(String designation, double ra2, double dec2, double parallax, double l, double b, double photGMeanMag,
            double dr2RadialVelocity, double bpRp) {
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public double getDec() {
        return dec;
    }

    public void setDec(double dec) {
        this.dec = dec;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    // Otros métodos relevantes de una estrella
    
    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", ra=" + ra +
                ", dec=" + dec +
                ", distance=" + distance +
                '}';
    }
}
