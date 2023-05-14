package com.gssg;

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
        List<StarData> starDataList = new ArrayList<>();

        // Datos de la estrella 1
        starDataList.add(new StarData("1636042515805110273", "Gaia EDR3 4295806720", "4295806720", "1067963836", 2016.0,
                44.99615537864534, 0.10161827, 0.005615226341865997, 0.10133387, 0.3543305595550248, 0.12266381,
                2.8886316, 12.616485, 11.93835156938502, 0.13794228, -4.0806193394130865, 0.13316983, 0.12293493,
                0.13202813, -0.08891027, 0.022551458, -0.3653421, -0.03690377, -0.24483804, 0.06301233, 0.13570854,
                0.3343367, 184, 0, 183, 1, 2.6720488, 242.20697, 0.3806193, 2.0765078, 31, false, 1.5089388, 0, 0, 0,
                22, 16, 0.21780181, 22, 9, 0, 0.01759732, 0, 0, 0, 90.23934, 0, 0, 1.1429516, 0.30795118, 0.19765861,
                0.43010107, 0.8420776, -87.75478, -30.69455, -46.20191, 30.174356, 0, false, 182, 1653.39471645947,
                2.0757642, 796.5234, 17.641426, 18, 800.4295459066461, 12.601409, 63.51905, 18.080235, 20,
                1187.588003883822, 15.823832, 75.0506, 17.061232, 0, 0, 0, 2, 0, 1.4565701, 2.4582462, 1.2892704,
                1.1689758, 0, 0, 0, 0, 0, 0, 176.94278852482034, -48.88493355232444, 42.54657309907107,
                -16.317212317623884));

        // Genera los sistemas estelares utilizando los datos del catálogo Gaia
        List<StarSystem> systems = generateSystems(starDataList);

        // Imprime los sistemas estelares generados
        for (StarSystem system : systems) {
            //System.out.println(system);

            // Crear un objeto ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Convertir el objeto a formato JSON
            try {
                // Imprime el sistema estelar en formato JSON
                String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(system);
                System.out.println("Generated system:\n" + jsonOutput);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

    // Genera los sistemas estelares utilizando los datos del catálogo Gaia
    private static List<StarSystem> generateSystems(List<StarData> starDataList) {
        List<StarSystem> systems = new ArrayList<>();
        // Genera un sistema estelar por cada estrella del catálogo Gaia
        for (StarData starData : starDataList) {

            /*
             * Crea una estrella con los siguientes atributos:
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

            Star star = new Star(starData.getDesignation(), starData.getRa(), starData.getDec(), starData.getParallax(),
                    starData.getL(), starData.getB(), starData.getPhotGMeanMag(), starData.getDr2RadialVelocity(),
                    starData.getBpRp());
            star.setParsecs();
            star.setYearLight();
            StarSystem system = new StarSystem(starData.getDesignation(), star);

            // Genera un número aleatorio de planetas (hasta 20)
            int numPlanets = (int) (Math.random() * 20); // Genera un número aleatorio de planetas (hasta 20)
            for (int i = 0; i < numPlanets; i++) {
                Planet planet = generatePlanet(system, i + 1);
                system.addPlanet(planet);
            }
            // Añade el sistema estelar a la lista de sistemas
            systems.add(system);
        }

        return systems;
    }

    // Genera un planeta con atributos aleatorios
    private static Planet generatePlanet(StarSystem starSystem, int planetIndex) {
        // Genera atributos aleatorios para el planeta
        String name = generatePlanetName(starSystem, planetIndex);
        double mass = Math.random() * 100;
        double radius = Math.random() * 10;
        double distance = Math.random() * 1000;
        double orbitalPeriod = Math.random() * 1000;

        /*
         * name: Es una cadena de texto que representa el nombre del planeta, por lo que
         * no se aplica una unidad específica.
         * mass: Se refiere a la masa del planeta. Las unidades comunes para la masa
         * planetaria son masas terrestres (M⊕) o masas solares (M☉).
         * radius: Representa el radio del planeta. Las unidades comunes para el radio
         * planetario son radios terrestres (R⊕) o radios solares (R☉).
         * distance: Indica la distancia del planeta a su estrella. Las unidades comunes
         * para la distancia planetaria son unidades astronómicas (UA) o kilómetros
         * (km).
         * orbitalPeriod: Es el período orbital del planeta, es decir, el tiempo que
         * tarda en completar una órbita alrededor de su estrella. Las unidades comunes
         * para el período orbital son días, años terrestres (yr) o cualquier unidad de
         * tiempo.
         */

        return new Planet(name, mass, radius, distance, orbitalPeriod);
    }

    // Genera el nombre de un planeta a partir del nombre del sistema estelar y el
    // índice del planeta
    private static String generatePlanetName(StarSystem starSystem, int planetIndex) {
        String systemIdentifier = starSystem.getName().replaceAll(" ", "_");
        String planetIdentifier = "P" + planetIndex;
        return systemIdentifier + "_" + planetIdentifier;
    }

}