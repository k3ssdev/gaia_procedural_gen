package com.gssg;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private String name;
    private Star star;
    private List<Planet> planets;
    
    // Constructor
    public StarSystem(String name, Star star) {
        this.name = name;
        this.star = star;
        this.planets = new ArrayList<>();
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
    
    // Métodos para agregar y remover planetas
    public void addPlanet(Planet planet) {
        planets.add(planet);
    }
    
    public void removePlanet(Planet planet) {
        planets.remove(planet);
    }
    
    // Otros métodos relevantes de un sistema estelar
    
    @Override
    public String toString() {
        return "StarSystem{" +
                "name='" + name + '\'' +
                ", star=" + star +
                ", planets=" + planets +
                '}';
    }
}
