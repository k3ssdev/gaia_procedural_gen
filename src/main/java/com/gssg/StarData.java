package com.gssg;

public class StarData {
    private long solutionId;
    private String designation;
    private long sourceId;
    private long randomIndex;
    private double refEpoch;
    private double ra;
    private double raError;
    private double dec;
    private double decError;
    private double parallax;
    private double parallaxError;
    // Otros atributos...

    // Constructor
    public StarData(long solutionId, String designation, long sourceId, long randomIndex, double refEpoch, double ra, double raError, double dec, double decError, double parallax, double parallaxError) {
        this.solutionId = solutionId;
        this.designation = designation;
        this.sourceId = sourceId;
        this.randomIndex = randomIndex;
        this.refEpoch = refEpoch;
        this.ra = ra;
        this.raError = raError;
        this.dec = dec;
        this.decError = decError;
        this.parallax = parallax;
        this.parallaxError = parallaxError;
        // Inicializa los demás atributos...
    }

    // Getters y setters...

    public long getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(long solutionId) {
        this.solutionId = solutionId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public long getRandomIndex() {
        return randomIndex;
    }

    public void setRandomIndex(long randomIndex) {
        this.randomIndex = randomIndex;
    }

    public double getRefEpoch() {
        return refEpoch;
    }

    public void setRefEpoch(double refEpoch) {
        this.refEpoch = refEpoch;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public double getRaError() {
        return raError;
    }

    public void setRaError(double raError) {
        this.raError = raError;
    }

    public double getDec() {
        return dec;
    }

    public void setDec(double dec) {
        this.dec = dec;
    }

    public double getDecError() {
        return decError;
    }

    public void setDecError(double decError) {
        this.decError = decError;
    }

    public double getParallax() {
        return parallax;
    }

    public void setParallax(double parallax) {
        this.parallax = parallax;
    }

    public double getParallaxError() {
        return parallaxError;
    }

    public void setParallaxError(double parallaxError) {
        this.parallaxError = parallaxError;
    }

    // Otros getters y setters...

    @Override
    public String toString() {
        return "StarData{" +
                "solutionId=" + solutionId +
                ", designation='" + designation + '\'' +
                ", sourceId=" + sourceId +
                ", randomIndex=" + randomIndex +
                ", refEpoch=" + refEpoch +
                ", ra=" + ra +
                ", raError=" + raError +
                ", dec=" + dec +
                ", decError=" + decError +
                ", parallax=" + parallax +
                ", parallaxError=" + parallaxError +
                // Agrega los demás atributos al toString...
                '}';
    }
}
