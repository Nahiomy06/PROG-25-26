package org.example;

public class Species {

    private int species_id;
    private String species;

    public Species(String species) {
        this.species = species;
    }

    public int getSpecies_id() {
        return species_id;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Species{" +
                "species_id=" + species_id +
                ", species='" + species + '\'' +
                '}';
    }
}
