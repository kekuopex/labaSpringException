package com.example.demo;

public class CountrySearch {
    private String name;
    private String continent;
    private Integer population;


    public CountrySearch(String name, String continent, Integer population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getContinent() { return continent; }
    public void setContinent(String continent) { this.continent = continent; }
    public Integer population() { return population; }
    public void setPopulation(Integer population) { this.population = population; }
}
