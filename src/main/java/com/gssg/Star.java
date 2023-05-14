package com.gssg;

public class Star {
    private String name;
    private double ra;
    private double dec;
    private double parsecs;
    private double yearLight;
    private double parallax;
    private double l;
    private double b;
    private double photGMeanMag;
    private double dr2RadialVelocity;
    private double bpRp;


    // Constructor
    public Star(String name, double ra, double dec, double parsecs, double yearLight) {
        this.name = name;
        this.ra = ra;
        this.dec = dec;
        this.parsecs = parsecs;
        this.yearLight = yearLight;
    }

    public Star(String designation, double ra, double dec, double parallax, double l, double b, double photGMeanMag,
            double dr2RadialVelocity, double bpRp) {
        this.name = designation;
        this.ra = ra;
        this.dec = dec;
        this.parallax = parallax;
        this.l = l;
        this.b = b;
        this.photGMeanMag = photGMeanMag;
        this.dr2RadialVelocity = dr2RadialVelocity;
        this.bpRp = bpRp;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public double getRa() {
        return ra;
    }

    public double getDec() {
        return dec;
    }

    public double getParsecs() {
        return parsecs;
    }

    public double getYearLight() {
        return yearLight;
    }

    public double getParallax() {
        return parallax;
    }

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }

    public double getPhotGMeanMag() {
        return photGMeanMag;
    }

    public double getDr2RadialVelocity() {
        return dr2RadialVelocity;
    }

    public double getBpRp() {
        return bpRp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public void setDec(double dec) {
        this.dec = dec;
    }

    /*
     * Distance in parsecs (d) = 1 / parallax (p)
     * Distance in light-years (d_ly) = d * 3.26
     * 
     * 
     * Parallax (p) is measured in arcseconds.
     * Distance (d) is expressed in parsecs.
     * Distance in light-years (d_ly) is calculated by multiplying the distance in
     * parsecs
     * by the conversion factor of approximately 3.26.
     */

    public void setParsecs() {
        this.parsecs = 1 / this.parallax;
    }

    public void setYearLight() {
        this.yearLight = this.parsecs * 3.26;
    }

    public void setParallax(double parallax) {
        this.parallax = parallax;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setPhotGMeanMag(double photGMeanMag) {
        this.photGMeanMag = photGMeanMag;
    }

    public void setDr2RadialVelocity(double dr2RadialVelocity) {
        this.dr2RadialVelocity = dr2RadialVelocity;
    }

    public void setBpRp(double bpRp) {
        this.bpRp = bpRp;
    }

    @Override

    public String toString() {
        return "Star [name=" + name + ", ra=" + ra + ", dec=" + dec + ", parsecs=" + parsecs + ", y/l=" + yearLight
                + ", parallax="
                + parallax + ", l=" + l + ", b=" + b + ", photGMeanMag=" + photGMeanMag + ", dr2RadialVelocity="
                + dr2RadialVelocity + ", bpRp=" + bpRp + "]";
    }

}
