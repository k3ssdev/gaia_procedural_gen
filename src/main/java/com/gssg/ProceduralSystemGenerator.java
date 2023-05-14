package com.gssg;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ProceduralSystemGenerator {
    public static void main(String[] args) {
        List<StarData> starDataList = new ArrayList<>();

        // Agrega los datos de las estrellas del catálogo Gaia
        starDataList.add(new StarData(
                1636042515805110273L,
                "Gaia EDR3 4295806720",
                0, 0, 44.99615537864534,
                0.005615226341865997,
                0.10161827,
                0.10133387,
                0.3543305595550248,
                0.12266381,
                2.8886316));

        starDataList.add(new StarData(
                1636042515805110273L,
                "Gaia EDR3 34361129088",
                0, 0, 45.00432028915398,
                0.021047763781174733,
                0.09731972,
                0.101752974,
                3.235017271512856,
                0.12045025,
                26.857704));

        starDataList.add(new StarData(
                1636042515805110273L,
                "Gaia EDR3 38655544960",
                0, 0, 45.004978371745516,
                0.019879675701858644,
                0.017885398,
                0.01877158,
                3.1391701154499523,
                0.022347411,
                140.47131));

        // Genera los sistemas estelares utilizando los datos del catálogo Gaia
        List<StarSystem> systems = generateSystems(starDataList);

        // Imprime los sistemas estelares generados
        for (StarSystem system : systems) {
            System.out.println(system);
        }
    }

    private static List<StarSystem> generateSystems(List<StarData> starDataList) {
        List<StarSystem> systems = new ArrayList<>();
    
        for (StarData starData : starDataList) {
            Star star = new Star(starData.getDesignation(), starData.getRa(), starData.getDec(), starData.getParallax());
            StarSystem system = new StarSystem(starData.getDesignation(), star);
    
            int numPlanets = (int) (Math.random() * 20); // Genera un número aleatorio de planetas (hasta 20)
            for (int i = 0; i < numPlanets; i++) {
                Planet planet = generatePlanet(system, i + 1);
                system.addPlanet(planet);
            }
    
            systems.add(system);
        }
    
        return systems;
    }
    

    private static Planet generatePlanet(StarSystem starSystem, int planetIndex) {
        // Genera atributos aleatorios para el planeta
        String name = generatePlanetName(starSystem, planetIndex);
        double mass = Math.random() * 100;
        double radius = Math.random() * 10;
        double distance = Math.random() * 1000;
        double orbitalPeriod = Math.random() * 1000;

        return new Planet(name, mass, radius, distance, orbitalPeriod);
    }

    private static String generatePlanetName(StarSystem starSystem, int planetIndex) {
        String systemIdentifier = starSystem.getName().replaceAll(" ", "_");
        String planetIdentifier = "P" + planetIndex;
        return systemIdentifier + "_" + planetIdentifier;
    }

}