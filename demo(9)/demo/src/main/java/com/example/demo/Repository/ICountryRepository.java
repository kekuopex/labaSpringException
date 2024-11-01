package com.example.demo.Repository;

import com.example.demo.Models.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICountryRepository {
    Country findByCode(String code);
    List<Country> findByContinent(String continent);
    List<Country> findByContinentAndNameStartingWith(String continent, String name);
    List<Country> findByContinentAndPopulationGreaterThanEqual(String continent, Integer population);
    Country findByName(String name);
    List<String> getContinents();
}