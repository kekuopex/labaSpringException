package com.example.demo.Models;

import com.example.demo.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Country {


    private String code;
    private String name;
    private String continent;
    private Double surfaceArea;
    private Integer population;


    public Country(String code, String name, String continent, Double surfaceArea, Integer population) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public Double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }


}