package com.gssg;

public class StarData {
    private String solutionId;
    private String designation;
    private String sourceId;
    private String randomIndex;
    private double refEpoch;
    private double ra;
    private double raError;
    private double dec;
    private double decError;
    private double parallax;
    private double parallaxError;
    private double parallaxOverError;
    private double pm;
    private double pmra;
    private double pmraError;
    private double pmdec;
    private double pmdecError;
    private double raDecCorr;
    private double raParallaxCorr;
    private double raPmraCorr;
    private double raPmdecCorr;
    private double decParallaxCorr;
    private double decPmraCorr;
    private double decPmdecCorr;
    private double parallaxPmraCorr;
    private double parallaxPmdecCorr;
    private double pmraPmdecCorr;
    private int astrometricNObsAl;
    private int astrometricNObsAc;
    private int astrometricNGoodObsAl;
    private int astrometricNBadObsAl;
    private double astrometricGofAl;
    private double astrometricChi2Al;
    private double astrometricExcessNoise;
    private double astrometricExcessNoiseSig;
    private int astrometricParamsSolved;
    private boolean astrometricPrimaryFlag;
    private double nuEffUsedInAstrometry;
    private double pseudocolour;
    private double pseudocolourError;
    private double raPseudocolourCorr;
    private double decPseudocolourCorr;
    private double parallaxPseudocolourCorr;
    private double pmraPseudocolourCorr;
    private double pmdecPseudocolourCorr;
    private int astrometricMatchedTransits;
    private int visibilityPeriodsUsed;
    private double astrometricSigma5dMax;
    private int matchedTransits;
    private int newMatchedTransits;
    private int matchedTransitsRemoved;
    private double ipdGofHarmonicAmplitude;
    private double ipdGofHarmonicPhase;
    private double ipdFracMultiPeak;
    private double ipdFracOddWin;
    private double ruwe;
    private double scanDirectionStrengthK1;
    private double scanDirectionStrengthK2;
    private double scanDirectionStrengthK3;
    private double scanDirectionStrengthK4;
    private double scanDirectionMeanK1;
    private double scanDirectionMeanK2;
    private double scanDirectionMeanK3;
    private double scanDirectionMeanK4;
    private boolean duplicatedSource;
    private int photGNObs;
    private double photGMeanFlux;
    private double photGMeanFluxError;
    private double photGMeanFluxOverError;
    private double photGMeanMag;
    private int photBpNObs;
    private double photBpMeanFlux;
    private double photBpMeanFluxError;
    private double photBpMeanFluxOverError;
    private double photBpMeanMag;
    private int photRpNObs;
    private double photRpMeanFlux;
    private double photRpMeanFluxError;
    private double photRpMeanFluxOverError;
    private double photRpMeanMag;
    private int photBpNContaminatedTransits;
    private int photBpNBlendedTransits;
    private int photRpNContaminatedTransits;
    private int photRpNBlendedTransits;
    private int photProcMode;
    private double photBpRpExcessFactor;
    private double bpRp;
    private double bpG;
    private double gRp;
    private double dr2RadialVelocity;
    private double dr2RadialVelocityError;
    private int dr2RvNbTransits;
    private double dr2RvTemplateTeff;
    private double dr2RvTemplateLogg;
    private double dr2RvTemplateFeH;
    private double l;
    private double b;
    private double eclLon;
    private double eclLat;

    public StarData(
            String solutionId, String designation, String sourceId, String randomIndex, double refEpoch, double ra,
            double raError, double dec, double decError, double parallax, double parallaxError,
            double parallaxOverError,
            double pm, double pmra, double pmraError, double pmdec, double pmdecError, double raDecCorr,
            double raParallaxCorr, double raPmraCorr, double raPmdecCorr, double decParallaxCorr, double decPmraCorr,
            double decPmdecCorr, double parallaxPmraCorr, double parallaxPmdecCorr, double pmraPmdecCorr,
            int astrometricNObsAl, int astrometricNObsAc, int astrometricNGoodObsAl, int astrometricNBadObsAl,
            double astrometricGofAl, double astrometricChi2Al, double astrometricExcessNoise,
            double astrometricExcessNoiseSig, int astrometricParamsSolved, boolean astrometricPrimaryFlag,
            double nuEffUsedInAstrometry, double pseudocolour, double pseudocolourError, double raPseudocolourCorr,
            double decPseudocolourCorr, double parallaxPseudocolourCorr, double pmraPseudocolourCorr,
            double pmdecPseudocolourCorr, int astrometricMatchedTransits, int visibilityPeriodsUsed,
            double astrometricSigma5dMax, int matchedTransits, int newMatchedTransits, int matchedTransitsRemoved,
            double ipdGofHarmonicAmplitude, double ipdGofHarmonicPhase, double ipdFracMultiPeak, double ipdFracOddWin,
            double ruwe, double scanDirectionStrengthK1, double scanDirectionStrengthK2, double scanDirectionStrengthK3,
            double scanDirectionStrengthK4, double scanDirectionMeanK1, double scanDirectionMeanK2,
            double scanDirectionMeanK3, double scanDirectionMeanK4, boolean duplicatedSource, int photGNObs,
            double photGMeanFlux, double photGMeanFluxError, double photGMeanFluxOverError, double photGMeanMag,
            int photBpNObs, double photBpMeanFlux, double photBpMeanFluxError, double photBpMeanFluxOverError,
            double photBpMeanMag, int photRpNObs, double photRpMeanFlux, double photRpMeanFluxError,
            double photRpMeanFluxOverError, double photRpMeanMag, int photBpNContaminatedTransits,
            int photBpNBlendedTransits, int photRpNContaminatedTransits, int photRpNBlendedTransits, int photProcMode,
            double photBpRpExcessFactor, double bpRp, double bpG, double gRp, double dr2RadialVelocity,
            double dr2RadialVelocityError, int dr2RvNbTransits, double dr2RvTemplateTeff, double dr2RvTemplateLogg,
            double dr2RvTemplateFeH, double l, double b, double eclLon, double eclLat)

    {
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
        this.parallaxOverError = parallaxOverError;
        this.pm = pm;
        this.pmra = pmra;
        this.pmraError = pmraError;
        this.pmdec = pmdec;
        this.pmdecError = pmdecError;
        this.raDecCorr = raDecCorr;
        this.raParallaxCorr = raParallaxCorr;
        this.raPmraCorr = raPmraCorr;
        this.raPmdecCorr = raPmdecCorr;
        this.decParallaxCorr = decParallaxCorr;
        this.decPmraCorr = decPmraCorr;
        this.decPmdecCorr = decPmdecCorr;
        this.parallaxPmraCorr = parallaxPmraCorr;
        this.parallaxPmdecCorr = parallaxPmdecCorr;
        this.pmraPmdecCorr = pmraPmdecCorr;
        this.astrometricNObsAl = astrometricNObsAl;
        this.astrometricNObsAc = astrometricNObsAc;
        this.astrometricNGoodObsAl = astrometricNGoodObsAl;
        this.astrometricNBadObsAl = astrometricNBadObsAl;
        this.astrometricGofAl = astrometricGofAl;
        this.astrometricChi2Al = astrometricChi2Al;
        this.astrometricExcessNoise = astrometricExcessNoise;
        this.astrometricExcessNoiseSig = astrometricExcessNoiseSig;
        this.astrometricParamsSolved = astrometricParamsSolved;
        this.astrometricPrimaryFlag = astrometricPrimaryFlag;
        this.nuEffUsedInAstrometry = nuEffUsedInAstrometry;
        this.pseudocolour = pseudocolour;
        this.pseudocolour = pseudocolourError;
        this.raPseudocolourCorr = raPseudocolourCorr;
        this.decPseudocolourCorr = decPseudocolourCorr;
        this.parallaxPseudocolourCorr = parallaxPseudocolourCorr;
        this.pmraPseudocolourCorr = pmraPseudocolourCorr;
        this.pmdecPseudocolourCorr = pmdecPseudocolourCorr;
        this.astrometricMatchedTransits = astrometricMatchedTransits;
        this.visibilityPeriodsUsed = visibilityPeriodsUsed;
        this.astrometricSigma5dMax = astrometricSigma5dMax;
        this.matchedTransits = matchedTransits;
        this.newMatchedTransits = newMatchedTransits;
        this.matchedTransitsRemoved = matchedTransitsRemoved;
        this.ipdGofHarmonicAmplitude = ipdGofHarmonicAmplitude;
        this.ipdGofHarmonicPhase = ipdGofHarmonicPhase;
        this.ipdFracMultiPeak = ipdFracMultiPeak;
        this.ipdFracOddWin = ipdFracOddWin;
        this.ruwe = ruwe;
        this.scanDirectionStrengthK1 = scanDirectionStrengthK1;
        this.scanDirectionStrengthK2 = scanDirectionStrengthK2;
        this.scanDirectionStrengthK3 = scanDirectionStrengthK3;
        this.scanDirectionStrengthK4 = scanDirectionStrengthK4;
        this.scanDirectionMeanK1 = scanDirectionMeanK1;
        this.scanDirectionMeanK2 = scanDirectionMeanK2;
        this.scanDirectionMeanK3 = scanDirectionMeanK3;
        this.scanDirectionMeanK4 = scanDirectionMeanK4;
        this.duplicatedSource = duplicatedSource;
        this.photGNObs = photGNObs;
        this.photGMeanFlux = photGMeanFlux;
        this.photGMeanFluxError = photGMeanFluxError;
        this.photGMeanFluxOverError = photGMeanFluxOverError;
        this.photGMeanMag = photGMeanMag;
        this.photBpNObs = photBpNObs;
        this.photBpMeanFlux = photBpMeanFlux;
        this.photBpMeanFluxError = photBpMeanFluxError;
        this.photBpMeanFluxOverError = photBpMeanFluxOverError;
        this.photBpMeanMag = photBpMeanMag;
        this.photRpNObs = photRpNObs;
        this.photRpMeanFlux = photRpMeanFlux;
        this.photRpMeanFluxError = photRpMeanFluxError;
        this.photRpMeanFluxOverError = photRpMeanFluxOverError;
        this.photRpMeanMag = photRpMeanMag;
        this.photBpNContaminatedTransits = photBpNContaminatedTransits;
        this.photBpNBlendedTransits = photBpNBlendedTransits;
        this.photRpNContaminatedTransits = photRpNContaminatedTransits;
        this.photRpNBlendedTransits = photRpNBlendedTransits;
        this.photProcMode = photProcMode;
        this.photBpRpExcessFactor = photBpRpExcessFactor;
        this.bpRp = bpRp;
        this.bpG = bpG;
        this.gRp = gRp;
        this.dr2RadialVelocity = dr2RadialVelocity;
        this.dr2RadialVelocityError = dr2RadialVelocityError;
        this.dr2RvNbTransits = dr2RvNbTransits;
        this.dr2RvTemplateTeff = dr2RvTemplateTeff;
        this.dr2RvTemplateLogg = dr2RvTemplateLogg;
        this.dr2RvTemplateFeH = dr2RvTemplateFeH;
        this.l = l;
        this.b = b;
        this.eclLon = eclLon;
        this.eclLat = eclLat;
    }

    // Getters

    public String getSolutionId() {
        return solutionId;
    }

    public String getDesignation() {
        return designation;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getRandomIndex() {
        return randomIndex;
    }

    public double getRefEpoch() {
        return refEpoch;
    }

    public double getRa() {
        return ra;
    }

    public double getRaError() {
        return raError;
    }

    public double getDec() {
        return dec;
    }

    public double getDecError() {
        return decError;
    }

    public double getParallax() {
        return parallax;
    }

    public double getParallaxError() {
        return parallaxError;
    }

    public double getParallaxOverError() {
        return parallaxOverError;
    }

    public double getPm() {
        return pm;
    }

    public double getPmra() {
        return pmra;
    }

    public double getPmraError() {
        return pmraError;
    }

    public double getPmdec() {
        return pmdec;
    }

    public double getPmdecError() {
        return pmdecError;
    }

    public double getRaDecCorr() {
        return raDecCorr;
    }

    public double getRaParallaxCorr() {
        return raParallaxCorr;
    }

    public double getRaPmraCorr() {
        return raPmraCorr;
    }

    public double getRaPmdecCorr() {
        return raPmdecCorr;
    }

    public double getDecParallaxCorr() {
        return decParallaxCorr;
    }

    public double getDecPmraCorr() {
        return decPmraCorr;
    }

    public double getDecPmdecCorr() {
        return decPmdecCorr;
    }

    public double getParallaxPmraCorr() {
        return parallaxPmraCorr;
    }

    public double getParallaxPmdecCorr() {
        return parallaxPmdecCorr;
    }

    public double getPmraPmdecCorr() {
        return pmraPmdecCorr;
    }

    public int getAstrometricNObsAl() {
        return astrometricNObsAl;
    }

    public int getAstrometricNObsAc() {
        return astrometricNObsAc;
    }

    public int getAstrometricNGoodObsAl() {
        return astrometricNGoodObsAl;
    }

    public int getAstrometricNBadObsAl() {
        return astrometricNBadObsAl;
    }

    public double getAstrometricGofAl() {
        return astrometricGofAl;
    }

    public double getAstrometricChi2Al() {
        return astrometricChi2Al;
    }

    public double getAstrometricExcessNoise() {
        return astrometricExcessNoise;
    }

    public double getAstrometricExcessNoiseSig() {
        return astrometricExcessNoiseSig;
    }

    public int getAstrometricParamsSolved() {
        return astrometricParamsSolved;
    }

    public boolean isAstrometricPrimaryFlag() {
        return astrometricPrimaryFlag;
    }

    public double getNuEffUsedInAstrometry() {
        return nuEffUsedInAstrometry;
    }

    public double getPseudocolour() {
        return pseudocolour;
    }

    public double getPseudocolourError() {
        return pseudocolourError;
    }

    public double getRaPseudocolourCorr() {
        return raPseudocolourCorr;
    }

    public double getDecPseudocolourCorr() {
        return decPseudocolourCorr;
    }

    public double getParallaxPseudocolourCorr() {
        return parallaxPseudocolourCorr;
    }

    public double getPmraPseudocolourCorr() {
        return pmraPseudocolourCorr;
    }

    public double getPmdecPseudocolourCorr() {
        return pmdecPseudocolourCorr;
    }

    public int getAstrometricMatchedTransits() {
        return astrometricMatchedTransits;
    }

    public int getVisibilityPeriodsUsed() {
        return visibilityPeriodsUsed;
    }

    public double getAstrometricSigma5dMax() {
        return astrometricSigma5dMax;
    }

    public int getMatchedTransits() {
        return matchedTransits;
    }

    public int getNewMatchedTransits() {
        return newMatchedTransits;
    }

    public int getMatchedTransitsRemoved() {
        return matchedTransitsRemoved;
    }

    public double getIpdGofHarmonicAmplitude() {
        return ipdGofHarmonicAmplitude;
    }

    public double getIpdGofHarmonicPhase() {
        return ipdGofHarmonicPhase;
    }

    public double getIpdFracMultiPeak() {
        return ipdFracMultiPeak;
    }

    public double getIpdFracOddWin() {
        return ipdFracOddWin;
    }

    public double getRuwe() {
        return ruwe;
    }

    public double getScanDirectionStrengthK1() {
        return scanDirectionStrengthK1;
    }

    public double getScanDirectionStrengthK2() {
        return scanDirectionStrengthK2;
    }

    public double getScanDirectionStrengthK3() {
        return scanDirectionStrengthK3;
    }

    public double getScanDirectionStrengthK4() {
        return scanDirectionStrengthK4;
    }

    public double getScanDirectionMeanK1() {
        return scanDirectionMeanK1;
    }

    public double getScanDirectionMeanK2() {
        return scanDirectionMeanK2;
    }

    public double getScanDirectionMeanK3() {
        return scanDirectionMeanK3;
    }

    public double getScanDirectionMeanK4() {
        return scanDirectionMeanK4;
    }

    public boolean isDuplicatedSource() {
        return duplicatedSource;
    }

    public int getPhotGNObs() {
        return photGNObs;
    }

    public double getPhotGMeanFlux() {
        return photGMeanFlux;
    }

    public double getPhotGMeanFluxError() {
        return photGMeanFluxError;
    }

    public double getPhotGMeanFluxOverError() {
        return photGMeanFluxOverError;
    }

    public double getPhotGMeanMag() {
        return photGMeanMag;
    }

    public int getPhotBpNObs() {
        return photBpNObs;
    }

    public double getPhotBpMeanFlux() {
        return photBpMeanFlux;
    }

    public double getPhotBpMeanFluxError() {
        return photBpMeanFluxError;
    }

    public double getPhotBpMeanFluxOverError() {
        return photBpMeanFluxOverError;
    }

    public double getPhotBpMeanMag() {
        return photBpMeanMag;
    }

    public int getPhotRpNObs() {
        return photRpNObs;
    }

    public double getPhotRpMeanFlux() {
        return photRpMeanFlux;
    }

    public double getPhotRpMeanFluxError() {
        return photRpMeanFluxError;
    }

    public double getPhotRpMeanFluxOverError() {
        return photRpMeanFluxOverError;
    }

    public double getPhotRpMeanMag() {
        return photRpMeanMag;
    }

    public int getPhotBpNContaminatedTransits() {
        return photBpNContaminatedTransits;
    }

    public int getPhotBpNBlendedTransits() {
        return photBpNBlendedTransits;
    }

    public int getPhotRpNContaminatedTransits() {
        return photRpNContaminatedTransits;
    }

    public int getPhotRpNBlendedTransits() {
        return photRpNBlendedTransits;
    }

    public int getPhotProcMode() {
        return photProcMode;
    }

    public double getPhotBpRpExcessFactor() {
        return photBpRpExcessFactor;
    }

    public double getBpRp() {
        return bpRp;
    }

    public double getBpG() {
        return bpG;
    }

    public double getGRp() {
        return gRp;
    }

    public double getDr2RadialVelocity() {
        return dr2RadialVelocity;
    }

    public double getDr2RadialVelocityError() {
        return dr2RadialVelocityError;
    }

    public int getDr2RvNbTransits() {
        return dr2RvNbTransits;
    }

    public double getDr2RvTemplateTeff() {
        return dr2RvTemplateTeff;
    }

    public double getDr2RvTemplateLogg() {
        return dr2RvTemplateLogg;
    }

    public double getDr2RvTemplateFeH() {
        return dr2RvTemplateFeH;
    }

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }

    public double getEclLon() {
        return eclLon;
    }

    public double getEclLat() {
        return eclLat;
    }

    // Setters

    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setRandomIndex(String randomIndex) {
        this.randomIndex = randomIndex;
    }

    public void setRefEpoch(double refEpoch) {
        this.refEpoch = refEpoch;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public void setRaError(double raError) {
        this.raError = raError;
    }

    public void setDec(double dec) {
        this.dec = dec;
    }

    public void setDecError(double decError) {
        this.decError = decError;
    }

    public void setParallax(double parallax) {
        this.parallax = parallax;
    }

    public void setParallaxError(double parallaxError) {
        this.parallaxError = parallaxError;
    }

    public void setParallaxOverError(double parallaxOverError) {
        this.parallaxOverError = parallaxOverError;
    }

    public void setPm(double pm) {
        this.pm = pm;
    }

    public void setPmra(double pmra) {
        this.pmra = pmra;
    }

    public void setPmraError(double pmraError) {
        this.pmraError = pmraError;
    }

    public void setPmdec(double pmdec) {
        this.pmdec = pmdec;
    }

    public void setPmdecError(double pmdecError) {
        this.pmdecError = pmdecError;
    }

    public void setRaDecCorr(double raDecCorr) {
        this.raDecCorr = raDecCorr;
    }

    public void setRaParallaxCorr(double raParallaxCorr) {
        this.raParallaxCorr = raParallaxCorr;
    }

    public void setRaPmraCorr(double raPmraCorr) {
        this.raPmraCorr = raPmraCorr;
    }

    public void setRaPmdecCorr(double raPmdecCorr) {
        this.raPmdecCorr = raPmdecCorr;
    }

    public void setDecParallaxCorr(double decParallaxCorr) {
        this.decParallaxCorr = decParallaxCorr;
    }

    public void setDecPmraCorr(double decPmraCorr) {
        this.decPmraCorr = decPmraCorr;
    }

    public void setDecPmdecCorr(double decPmdecCorr) {
        this.decPmdecCorr = decPmdecCorr;
    }

    public void setParallaxPmraCorr(double parallaxPmraCorr) {
        this.parallaxPmraCorr = parallaxPmraCorr;
    }

    public void setParallaxPmdecCorr(double parallaxPmdecCorr) {
        this.parallaxPmdecCorr = parallaxPmdecCorr;
    }

    public void setPmraPmdecCorr(double pmraPmdecCorr) {
        this.pmraPmdecCorr = pmraPmdecCorr;
    }

    public void setAstrometricNObsAl(int astrometricNObsAl) {
        this.astrometricNObsAl = astrometricNObsAl;
    }

    public void setAstrometricNObsAc(int astrometricNObsAc) {
        this.astrometricNObsAc = astrometricNObsAc;
    }

    public void setAstrometricNGoodObsAl(int astrometricNGoodObsAl) {
        this.astrometricNGoodObsAl = astrometricNGoodObsAl;
    }

    public void setAstrometricNBadObsAl(int astrometricNBadObsAl) {
        this.astrometricNBadObsAl = astrometricNBadObsAl;
    }

    public void setAstrometricGofAl(double astrometricGofAl) {
        this.astrometricGofAl = astrometricGofAl;
    }

    public void setAstrometricChi2Al(double astrometricChi2Al) {
        this.astrometricChi2Al = astrometricChi2Al;
    }

    public void setAstrometricExcessNoise(double astrometricExcessNoise) {
        this.astrometricExcessNoise = astrometricExcessNoise;
    }

    public void setAstrometricExcessNoiseSig(double astrometricExcessNoiseSig) {
        this.astrometricExcessNoiseSig = astrometricExcessNoiseSig;
    }

    public void setAstrometricParamsSolved(int astrometricParamsSolved) {
        this.astrometricParamsSolved = astrometricParamsSolved;
    }

    public void setAstrometricPrimaryFlag(boolean astrometricPrimaryFlag) {
        this.astrometricPrimaryFlag = astrometricPrimaryFlag;
    }

    public void setNuEffUsedInAstrometry(double nuEffUsedInAstrometry) {
        this.nuEffUsedInAstrometry = nuEffUsedInAstrometry;
    }

    public void setPseudocolour(double pseudocolour) {
        this.pseudocolour = pseudocolour;
    }

    public void setPseudocolourError(double pseudocolourError) {
        this.pseudocolourError = pseudocolourError;
    }

    public void setRaPseudocolourCorr(double raPseudocolourCorr) {
        this.raPseudocolourCorr = raPseudocolourCorr;
    }

    public void setDecPseudocolourCorr(double decPseudocolourCorr) {
        this.decPseudocolourCorr = decPseudocolourCorr;
    }

    public void setParallaxPseudocolourCorr(double parallaxPseudocolourCorr) {
        this.parallaxPseudocolourCorr = parallaxPseudocolourCorr;
    }

    public void setPmraPseudocolourCorr(double pmraPseudocolourCorr) {
        this.pmraPseudocolourCorr = pmraPseudocolourCorr;
    }

    public void setPmdecPseudocolourCorr(double pmdecPseudocolourCorr) {
        this.pmdecPseudocolourCorr = pmdecPseudocolourCorr;
    }

    public void setAstrometricMatchedTransits(int astrometricMatchedTransits) {
        this.astrometricMatchedTransits = astrometricMatchedTransits;
    }

    public void setVisibilityPeriodsUsed(int visibilityPeriodsUsed) {
        this.visibilityPeriodsUsed = visibilityPeriodsUsed;
    }

    public void setAstrometricSigma5dMax(double astrometricSigma5dMax) {
        this.astrometricSigma5dMax = astrometricSigma5dMax;
    }

    public void setMatchedTransits(int matchedTransits) {
        this.matchedTransits = matchedTransits;
    }

    public void setNewMatchedTransits(int newMatchedTransits) {
        this.newMatchedTransits = newMatchedTransits;
    }

    public void setMatchedTransitsRemoved(int matchedTransitsRemoved) {
        this.matchedTransitsRemoved = matchedTransitsRemoved;
    }

    public void setIpdGofHarmonicAmplitude(double ipdGofHarmonicAmplitude) {
        this.ipdGofHarmonicAmplitude = ipdGofHarmonicAmplitude;
    }

    public void setIpdGofHarmonicPhase(double ipdGofHarmonicPhase) {
        this.ipdGofHarmonicPhase = ipdGofHarmonicPhase;
    }

    public void setIpdFracMultiPeak(double ipdFracMultiPeak) {
        this.ipdFracMultiPeak = ipdFracMultiPeak;
    }

    public void setIpdFracOddWin(double ipdFracOddWin) {
        this.ipdFracOddWin = ipdFracOddWin;
    }

    public void setRuwe(double ruwe) {
        this.ruwe = ruwe;
    }

    public void setScanDirectionStrengthK1(double scanDirectionStrengthK1) {
        this.scanDirectionStrengthK1 = scanDirectionStrengthK1;
    }

    public void setScanDirectionStrengthK2(double scanDirectionStrengthK2) {
        this.scanDirectionStrengthK2 = scanDirectionStrengthK2;
    }

    public void setScanDirectionStrengthK3(double scanDirectionStrengthK3) {
        this.scanDirectionStrengthK3 = scanDirectionStrengthK3;
    }

    public void setScanDirectionStrengthK4(double scanDirectionStrengthK4) {
        this.scanDirectionStrengthK4 = scanDirectionStrengthK4;
    }

    public void setScanDirectionMeanK1(double scanDirectionMeanK1) {
        this.scanDirectionMeanK1 = scanDirectionMeanK1;
    }

    public void setScanDirectionMeanK2(double scanDirectionMeanK2) {
        this.scanDirectionMeanK2 = scanDirectionMeanK2;
    }

    public void setScanDirectionMeanK3(double scanDirectionMeanK3) {
        this.scanDirectionMeanK3 = scanDirectionMeanK3;
    }

    public void setScanDirectionMeanK4(double scanDirectionMeanK4) {
        this.scanDirectionMeanK4 = scanDirectionMeanK4;
    }

    public void setDuplicatedSource(boolean duplicatedSource) {
        this.duplicatedSource = duplicatedSource;
    }

    public void setPhotGNObs(int photGNObs) {
        this.photGNObs = photGNObs;
    }

    public void setPhotGMeanFlux(double photGMeanFlux) {
        this.photGMeanFlux = photGMeanFlux;
    }

    public void setPhotGMeanFluxError(double photGMeanFluxError) {
        this.photGMeanFluxError = photGMeanFluxError;
    }

    public void setPhotGMeanFluxOverError(double photGMeanFluxOverError) {
        this.photGMeanFluxOverError = photGMeanFluxOverError;
    }

    public void setPhotGMeanMag(double photGMeanMag) {
        this.photGMeanMag = photGMeanMag;
    }

    public void setPhotBpNObs(int photBpNObs) {
        this.photBpNObs = photBpNObs;
    }

    public void setPhotBpMeanFlux(double photBpMeanFlux) {
        this.photBpMeanFlux = photBpMeanFlux;
    }

    public void setPhotBpMeanFluxError(double photBpMeanFluxError) {
        this.photBpMeanFluxError = photBpMeanFluxError;
    }

    public void setPhotBpMeanFluxOverError(double photBpMeanFluxOverError) {
        this.photBpMeanFluxOverError = photBpMeanFluxOverError;
    }

    public void setPhotBpMeanMag(double photBpMeanMag) {
        this.photBpMeanMag = photBpMeanMag;
    }

    public void setPhotRpNObs(int photRpNObs) {
        this.photRpNObs = photRpNObs;
    }

    public void setPhotRpMeanFlux(double photRpMeanFlux) {
        this.photRpMeanFlux = photRpMeanFlux;
    }

    public void setPhotRpMeanFluxError(double photRpMeanFluxError) {
        this.photRpMeanFluxError = photRpMeanFluxError;
    }

    public void setPhotRpMeanFluxOverError(double photRpMeanFluxOverError) {
        this.photRpMeanFluxOverError = photRpMeanFluxOverError;
    }

    public void setPhotRpMeanMag(double photRpMeanMag) {
        this.photRpMeanMag = photRpMeanMag;
    }

    public void setPhotBpNContaminatedTransits(int photBpNContaminatedTransits) {
        this.photBpNContaminatedTransits = photBpNContaminatedTransits;
    }

    public void setPhotBpNBlendedTransits(int photBpNBlendedTransits) {
        this.photBpNBlendedTransits = photBpNBlendedTransits;
    }

    public void setPhotRpNContaminatedTransits(int photRpNContaminatedTransits) {
        this.photRpNContaminatedTransits = photRpNContaminatedTransits;
    }

    public void setPhotRpNBlendedTransits(int photRpNBlendedTransits) {
        this.photRpNBlendedTransits = photRpNBlendedTransits;
    }

    public void setPhotProcMode(int photProcMode) {
        this.photProcMode = photProcMode;
    }

    public void setPhotBpRpExcessFactor(double photBpRpExcessFactor) {
        this.photBpRpExcessFactor = photBpRpExcessFactor;
    }

    public void setBpRp(double bpRp) {
        this.bpRp = bpRp;
    }

    public void setBpG(double bpG) {
        this.bpG = bpG;
    }

    public void setGRp(double gRp) {
        this.gRp = gRp;
    }

    public void setDr2RadialVelocity(double dr2RadialVelocity) {
        this.dr2RadialVelocity = dr2RadialVelocity;
    }

    public void setDr2RadialVelocityError(double dr2RadialVelocityError) {
        this.dr2RadialVelocityError = dr2RadialVelocityError;
    }

    public void setDr2RvNbTransits(int dr2RvNbTransits) {
        this.dr2RvNbTransits = dr2RvNbTransits;
    }

    public void setDr2RvTemplateTeff(double dr2RvTemplateTeff) {
        this.dr2RvTemplateTeff = dr2RvTemplateTeff;
    }

    public void setDr2RvTemplateLogg(double dr2RvTemplateLogg) {
        this.dr2RvTemplateLogg = dr2RvTemplateLogg;
    }

    public void setDr2RvTemplateFeH(double dr2RvTemplateFeH) {
        this.dr2RvTemplateFeH = dr2RvTemplateFeH;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setEclLon(int eclLon) {
        this.eclLon = eclLon;
    }

    public void setEclLat(int eclLat) {
        this.eclLat = eclLat;
    }

    // Other methods

    // Kind of object
    public boolean isStar() {
        return (this.photBpMeanMag != 0 && this.photRpMeanMag != 0);
    }

    public boolean isGalaxy() {
        return (this.photBpMeanMag == 0 && this.photRpMeanMag == 0);
    }

    public boolean isUnknown() {
        return (this.photBpMeanMag == 0 && this.photRpMeanMag != 0) ||
                (this.photBpMeanMag != 0 && this.photRpMeanMag == 0);
    }

    /*
     * designation: The object's designation can provide information about its type,
     * such as "Star," "Galaxy," "Quasar," and so on.
     * 
     * phot_g_mean_mag, phot_bp_mean_mag, phot_rp_mean_mag: These fields represent
     * magnitudes in different light bands (G, BP, RP). The combination of these
     * magnitudes can help identify if the object is a star, a galaxy, or a more
     * exotic object.
     * 
     * bp_rp: The BP-RP color index can be useful in distinguishing different types
     * of objects, as it can provide information about the object's temperature or
     * spectral features.
     * 
     * dr2_radial_velocity: Radial velocity can indicate whether the object is a
     * star with peculiar motion or if it is associated with a more massive object
     * such as a star cluster or a galaxy.
     */

    // Override toString method
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
                ", parallaxOverError=" + parallaxOverError +
                ", pm=" + pm +
                ", pmra=" + pmra +
                ", pmraError=" + pmraError +
                ", pmdec=" + pmdec +
                ", pmdecError=" + pmdecError +
                ", raDecCorr=" + raDecCorr +
                ", raParallaxCorr=" + raParallaxCorr +
                ", raPmraCorr=" + raPmraCorr +
                ", raPmdecCorr=" + raPmdecCorr +
                ", decParallaxCorr=" + decParallaxCorr +
                ", decPmraCorr=" + decPmraCorr +
                ", decPmdecCorr=" + decPmdecCorr +
                ", parallaxPmraCorr=" + parallaxPmraCorr +
                ", parallaxPmdecCorr=" + parallaxPmdecCorr +
                ", pmraPmdecCorr=" + pmraPmdecCorr +
                ", astrometricNObsAl=" + astrometricNObsAl +
                ", astrometricNObsAc=" + astrometricNObsAc +
                ", astrometricNGoodObsAl=" + astrometricNGoodObsAl +
                ", astrometricNBadObsAl=" + astrometricNBadObsAl +
                ", astrometricGofAl=" + astrometricGofAl +
                ", astrometricChi2Al=" + astrometricChi2Al +
                ", astrometricExcessNoise=" + astrometricExcessNoise +
                ", astrometricExcessNoiseSig=" + astrometricExcessNoiseSig +
                ", astrometricParamsSolved=" + astrometricParamsSolved +
                ", astrometricPrimaryFlag=" + astrometricPrimaryFlag +
                ", nuEffUsedInAstrometry=" + nuEffUsedInAstrometry +
                ", pseudocolour=" + pseudocolour +
                ", pseudocolourError=" + pseudocolourError +
                ", raPseudocolourCorr=" + raPseudocolourCorr +
                ", decPseudocolourCorr=" + decPseudocolourCorr +
                ", parallaxPseudocolourCorr=" + parallaxPseudocolourCorr +
                ", pmraPseudocolourCorr=" + pmraPseudocolourCorr +
                ", pmdecPseudocolourCorr=" + pmdecPseudocolourCorr +
                ", astrometricMatchedTransits=" + astrometricMatchedTransits +
                ", visibilityPeriodsUsed=" + visibilityPeriodsUsed +
                ", astrometricSigma5dMax=" + astrometricSigma5dMax +
                ", matchedTransits=" + matchedTransits +
                ", newMatchedTransits=" + newMatchedTransits +
                ", matchedTransitsRemoved=" + matchedTransitsRemoved +
                ", ipdGofHarmonicAmplitude=" + ipdGofHarmonicAmplitude +
                ", ipdGofHarmonicPhase=" + ipdGofHarmonicPhase +
                ", ipdFracMultiPeak=" + ipdFracMultiPeak +
                ", ipdFracOddWin=" + ipdFracOddWin +
                ", ruwe=" + ruwe +
                ", scanDirectionStrengthK1=" + scanDirectionStrengthK1 +
                ", scanDirectionStrengthK2=" + scanDirectionStrengthK2 +
                ", scanDirectionStrengthK3=" + scanDirectionStrengthK3 +
                ", scanDirectionStrengthK4=" + scanDirectionStrengthK4 +
                ", scanDirectionMeanK1=" + scanDirectionMeanK1 +
                ", scanDirectionMeanK2=" + scanDirectionMeanK2 +
                ", scanDirectionMeanK3=" + scanDirectionMeanK3 +
                ", scanDirectionMeanK4=" + scanDirectionMeanK4 +
                ", duplicatedSource=" + duplicatedSource +
                ", photGNObs=" + photGNObs +
                ", photGMeanFlux=" + photGMeanFlux +
                ", photGMeanFluxError=" + photGMeanFluxError +
                ", photGMeanFluxOverError=" + photGMeanFluxOverError +
                ", photGMeanMag=" + photGMeanMag +
                ", photBpNObs=" + photBpNObs +
                ", photBpMeanFlux=" + photBpMeanFlux +
                ", photBpMeanFluxError=" + photBpMeanFluxError +
                ", photBpMeanFluxOverError=" + photBpMeanFluxOverError +
                ", photBpMeanMag=" + photBpMeanMag +
                ", photRpNObs=" + photRpNObs +
                ", photRpMeanFlux=" + photRpMeanFlux +
                ", photRpMeanFluxError=" + photRpMeanFluxError +
                ", photRpMeanFluxOverError=" + photRpMeanFluxOverError +
                ", photRpMeanMag=" + photRpMeanMag +
                ", photBpNContaminatedTransits=" + photBpNContaminatedTransits +
                ", photBpNBlendedTransits=" + photBpNBlendedTransits +
                ", photRpNContaminatedTransits=" + photRpNContaminatedTransits +
                ", photRpNBlendedTransits=" + photRpNBlendedTransits +
                ", photProcMode=" + photProcMode +
                ", photBpRpExcessFactor=" + photBpRpExcessFactor +
                ", bpRp=" + bpRp +
                ", bpG=" + bpG +
                ", gRp=" + gRp +
                ", dr2RadialVelocity=" + dr2RadialVelocity +
                ", dr2RadialVelocityError=" + dr2RadialVelocityError +
                ", dr2RvNbTransits=" + dr2RvNbTransits +
                ", dr2RvTemplateTeff=" + dr2RvTemplateTeff +
                ", dr2RvTemplateLogg=" + dr2RvTemplateLogg +
                ", dr2RvTemplateFeH=" + dr2RvTemplateFeH +
                ", l=" + l +
                ", b=" + b +
                ", eclLon=" + eclLon +
                ", eclLat=" + eclLat +
                '}';
    }
}
