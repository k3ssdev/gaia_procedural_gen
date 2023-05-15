package com.gssg;

import java.util.Locale;
import java.io.File;
import java.nio.file.FileSystems;
/**
 * Planetary system generator based on Gaia DR3 star data concept code by Alberto Pérez.
 *
 */
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProceduralSystemGenerator {

    public static void main(String[] args) {

        // Set default locale to US
        Locale.setDefault(Locale.US);

        // New List of StarData objects
        List<StarData> starDataList = new ArrayList<>();

        // Read CSV file
        starDataList = ReadCSV.readCSV("src/main/resources/GaiaEDR3.csv");

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

        // ObjectMapper to convert objects to JSON
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonOutput;

        try {
            // Convert star systems to JSON and save to file
            jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(systems);
            ManageJSON.saveJson("src/main/resources/StarSystem.json", jsonOutput);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Clean console
        System.out.print("\033[H\033[2J");

        // Show number of star systems generated
        System.out.println("Number of star systems generated: " + systems.size());

        // Show number of planets in each star system
        Integer totalPlanets = 0;
        for (StarSystem system : systems) {
            totalPlanets += extracted(system);
        }
        System.out.println("Number of planets generated: " + totalPlanets);
        System.out.println("Average number of planets per system: " + totalPlanets / systems.size());
        System.out.println();

        // Show file path and size
        System.out.println("File saved!");
        System.out.println();
    }

    private static int extracted(StarSystem s) {
        return s.getPlanets().size();
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