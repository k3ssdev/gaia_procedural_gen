package com.gssg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 * Planetary system generator based on Gaia DR3 star data concept code by Alberto Pérez.
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProceduralSystemGenerator {

    public static void main(String[] args) {

        // Set default locale to US
        Locale.setDefault(Locale.US);

        List<StarData> starDataList = new ArrayList<>();

        // Read CSV file
        starDataList = readCSV("src/main/resources/GaiaEDR3.csv");

        // Manually add star data
        /*
         * starDataList.add(new StarData("1636042515805110273", "Gaia EDR3 4295806720",
         * "4295806720", "1067963836", 2016.0,
         * 44.99615537864534, 0.10161827, 0.005615226341865997, 0.10133387,
         * 0.3543305595550248, 0.12266381,
         * 2.8886316, 12.616485, 11.93835156938502, 0.13794228, -4.0806193394130865,
         * 0.13316983, 0.12293493,
         * 0.13202813, -0.08891027, 0.022551458, -0.3653421, -0.03690377, -0.24483804,
         * 0.06301233, 0.13570854,
         * 0.3343367, 184, 0, 183, 1, 2.6720488, 242.20697, 0.3806193, 2.0765078, 31,
         * false, 1.5089388, 0, 0, 0,
         * 22, 16, 0.21780181, 22, 9, 0, 0.01759732, 0, 0, 0, 90.23934, 0, 0, 1.1429516,
         * 0.30795118, 0.19765861,
         * 0.43010107, 0.8420776, -87.75478, -30.69455, -46.20191, 30.174356, 0, false,
         * 182, 1653.39471645947,
         * 2.0757642, 796.5234, 17.641426, 18, 800.4295459066461, 12.601409, 63.51905,
         * 18.080235, 20,
         * 1187.588003883822, 15.823832, 75.0506, 17.061232, 0, 0, 0, 2, 0, 1.4565701,
         * 2.4582462, 1.2892704,
         * 1.1689758, 0, 0, 0, 0, 0, 0, 176.94278852482034, -48.88493355232444,
         * 42.54657309907107,
         * -16.317212317623884));
         */

        // Generate star systems from Gaia DR3 data
        List<StarSystem> systems = generateSystems(starDataList);

        // Print star systems
        for (StarSystem system : systems) {
            // System.out.println(system);

            // ObjectMapper to convert objects to JSON
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                // Pretty print as JSON
                String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(system);
                System.out.println("StarSystem" + jsonOutput);
                // System.out.println(starDataList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<StarData> readCSV(String filename) {
        List<StarData> starDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Avoid first line with column names
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Check empty values
                for (int i = 0; i < values.length; i++) {
                    if (values[i].isEmpty()) {
                        values[i] = "0";
                    }
                }

                // Remove quotes
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].replace("\"", "");
                }

                // Print array
                //System.out.println(Arrays.toString(values));

                // New StarData object from CSV line
                StarData starData = new StarData(
                        values[0], // solutionId
                        values[1], // designation
                        values[2], // sourceId
                        values[3], // randomIndex
                        Double.parseDouble(values[4]), // refEpoch
                        Double.parseDouble(values[5]), // ra
                        Double.parseDouble(values[6]), // raError
                        Double.parseDouble(values[7]), // dec
                        Double.parseDouble(values[8]), // decError
                        Double.parseDouble(values[9]), // parallax
                        Double.parseDouble(values[10]), // parallaxError
                        Double.parseDouble(values[11]), // parallaxOverError
                        Double.parseDouble(values[12]), // pm
                        Double.parseDouble(values[13]), // pmra
                        Double.parseDouble(values[14]), // pmraError
                        Double.parseDouble(values[15]), // pmdec
                        Double.parseDouble(values[16]), // pmdecError
                        Double.parseDouble(values[17]), // raDecCorr
                        Double.parseDouble(values[18]), // raParallaxCorr
                        Double.parseDouble(values[19]), // raPmraCorr
                        Double.parseDouble(values[20]), // raPmdecCorr
                        Double.parseDouble(values[21]), // decParallaxCorr
                        Double.parseDouble(values[22]), // decPmraCorr
                        Double.parseDouble(values[23]), // decPmdecCorr
                        Double.parseDouble(values[24]), // parallaxPmraCorr
                        Double.parseDouble(values[25]), // parallaxPmdecCorr
                        Double.parseDouble(values[26]), // pmraPmdecCorr
                        Integer.parseInt(values[27]), // astrometricNObsAl
                        Integer.parseInt(values[28]), // astrometricNObsAc
                        Integer.parseInt(values[29]), // astrometricNGoodObsAl
                        Integer.parseInt(values[30]), // astrometricNBadObsAl
                        Double.parseDouble(values[31]), // astrometricGofAl
                        Double.parseDouble(values[32]), // astrometricChi2Al
                        Double.parseDouble(values[33]), // astrometricExcessNoise
                        Double.parseDouble(values[34]), // astrometricExcessNoiseSig
                        Integer.parseInt(values[35]), // astrometricParamsSolved
                        Boolean.parseBoolean(values[36]), // astrometricPrimaryFlag
                        Double.parseDouble(values[37]), // nuEffUsedInAstrometry
                        Double.parseDouble(values[38]), // pseudocolour
                        Double.parseDouble(values[39]), // pseudocolourError
                        Double.parseDouble(values[40]), // raPseudocolourCorr
                        Double.parseDouble(values[41]), // decPseudocolourCorr
                        Double.parseDouble(values[42]), // parallaxPseudocolourCorr
                        Double.parseDouble(values[43]), // pmraPseudocolourCorr
                        Double.parseDouble(values[44]), // pmdecPseudocolourCorr
                        Integer.parseInt(values[45]), // astrometricMatchedTransits
                        Integer.parseInt(values[46]), // visibilityPeriodsUsed
                        Double.parseDouble(values[47]), // astrometricSigma5dMax
                        Integer.parseInt(values[48]), // matchedTransits
                        Integer.parseInt(values[49]), // newMatchedTransits
                        Integer.parseInt(values[50]), // matchedTransitsRemoved
                        Double.parseDouble(values[51]), // ipdGofHarmonicAmplitude
                        Double.parseDouble(values[52]), // ipdGofHarmonicPhase
                        Double.parseDouble(values[53]), // ipdFracMultiPeak
                        Double.parseDouble(values[54]), // ipdFracOddWin
                        Double.parseDouble(values[55]), // ruwe
                        Double.parseDouble(values[56]), // scanDirectionStrengthK1
                        Double.parseDouble(values[57]), // scanDirectionStrengthK2
                        Double.parseDouble(values[58]), // scanDirectionStrengthK3
                        Double.parseDouble(values[59]), // scanDirectionStrengthK4
                        Double.parseDouble(values[60]), // scanDirectionMeanK1
                        Double.parseDouble(values[61]), // scanDirectionMeanK2
                        Double.parseDouble(values[62]), // scanDirectionMeanK3
                        Double.parseDouble(values[63]), // scanDirectionMeanK4
                        Boolean.parseBoolean(values[64]), // duplicatedSource
                        Integer.parseInt(values[65]), // photGNObs
                        Double.parseDouble(values[66]), // photGMeanFlux
                        Double.parseDouble(values[67]), // photGMeanFluxError
                        Double.parseDouble(values[68]), // photGMeanFluxOverError
                        Double.parseDouble(values[69]), // photGMeanMag
                        Integer.parseInt(values[70]), // photBpNObs
                        Double.parseDouble(values[71]), // photBpMeanFlux
                        Double.parseDouble(values[72]), // photBpMeanFluxError
                        Double.parseDouble(values[73]), // photBpMeanFluxOverError
                        Double.parseDouble(values[74]), // photBpMeanMag
                        Integer.parseInt(values[75]), // photRpNObs
                        Double.parseDouble(values[76]), // photRpMeanFlux
                        Double.parseDouble(values[77]), // photRpMeanFluxError
                        Double.parseDouble(values[78]), // photRpMeanFluxOverError
                        Double.parseDouble(values[79]), // photRpMeanMag
                        Integer.parseInt(values[80]), // photBpNContaminatedTransits
                        Integer.parseInt(values[81]), // photBpNBlendedTransits
                        Integer.parseInt(values[82]), // photRpNContaminatedTransits
                        Integer.parseInt(values[83]), // photRpNBlendedTransits
                        Integer.parseInt(values[84]), // photProcMode
                        Double.parseDouble(values[85]), // photBpRpExcessFactor
                        Double.parseDouble(values[86]), // bpRp
                        Double.parseDouble(values[87]), // bpG
                        Double.parseDouble(values[88]), // gRp
                        Double.parseDouble(values[89]), // dr2RadialVelocity
                        Double.parseDouble(values[90]), // dr2RadialVelocityError
                        Integer.parseInt(values[91]), // dr2RvNbTransits
                        Double.parseDouble(values[92]), // dr2RvTemplateTeff
                        Double.parseDouble(values[93]), // dr2RvTemplateLogg
                        Double.parseDouble(values[94]), // dr2RvTemplateFeH
                        Double.parseDouble(values[95]), // l
                        Double.parseDouble(values[96]), // b
                        Double.parseDouble(values[97]), // eclLon
                        Double.parseDouble(values[98]) // eclLat
                );

                starDataList.add(starData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return starDataList;
    }

    // Generates a list of star systems from a list of star data
    private static List<StarSystem> generateSystems(List<StarData> starDataList) {
        List<StarSystem> systems = new ArrayList<>();

        /*
         * Atributes of a starData object:
         * designation: The name or identifier of the star.
         * ra: Right ascension, which represents the star's position on the celestial
         * sphere.
         * dec: Declination, which represents the star's position on the celestial
         * sphere.
         * parallax: The parallax measurement of the star, providing information about
         * its distance.
         * l: Galactic longitude, indicating the star's position in the galaxy.
         * b: Galactic latitude, indicating the star's position in the galaxy.
         * photGMeanMag: The mean magnitude of the star in the G-band, providing
         * information about its brightness.
         * dr2RadialVelocity: Radial velocity, indicating the star's motion towards or
         * away from us.
         * bpRp: Color index representing the difference in magnitude between the Bp and
         * Rp bands, which can provide information about the star's temperature and
         * color.
         */

        // Generate a star system for each star data object
        for (StarData starData : starDataList) {

            if (starData.isStar()) {
                Star star = new Star(starData.getDesignation(), starData.getRa(), starData.getDec(),
                        starData.getParallax(),
                        starData.getL(), starData.getB(), starData.getPhotGMeanMag(), starData.getDr2RadialVelocity(),
                        starData.getBpRp());
                star.setParsecs();
                star.setYearLight();
                StarSystem system = new StarSystem(starData.getDesignation(), star);

                // Generate a random number of planets for the star system up to 20
                int numPlanets = (int) (Math.random() * 20);
                for (int i = 0; i < numPlanets; i++) {
                    Planet planet = generatePlanet(system, i + 1);
                    system.addPlanet(planet);
                }
                // Add the star system to the list of systems
                systems.add(system);
            } else {

                //

            }

        }

        return systems;
    }

    // Generate a planet for a star system
    private static Planet generatePlanet(StarSystem starSystem, int planetIndex) {
        // Planet attributes
        String name = generatePlanetName(starSystem, planetIndex);
        double mass = Math.random() * 100;
        double radius = Math.random() * 10;
        double distance = Math.random() * 1000;
        double orbitalPeriod = Math.random() * 1000;

        /*
         * name: It is a string that represents the name of the planet, so no specific
         * unit applies.
         * mass: Refers to the mass of the planet. Common units for planetary mass are
         * Earth masses (M⊕) or solar masses (M☉).
         * radius: Represents the radius of the planet. Common units for planetary
         * radius are Earth radii (R⊕) or solar radii (R☉).
         * distance: Indicates the distance of the planet to its star. Common units for
         * planetary distance are astronomical units (AU) or kilometers (km).
         * orbitalPeriod: It is the orbital period of the planet, i.e., the time it
         * takes to complete one orbit around its star. Common units for orbital period
         * are days, Earth years (yr), or any time unit.
         */

        return new Planet(name, mass, radius, distance, orbitalPeriod);
    }

    // Generate a name for a planet in a star system
    private static String generatePlanetName(StarSystem starSystem, int planetIndex) {
        String systemIdentifier = starSystem.getName().replaceAll(" ", "_");
        String planetIdentifier = "P" + planetIndex;
        return systemIdentifier + "_" + planetIdentifier;
    }

}