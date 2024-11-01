package com.example.demo.Controllers;

import com.example.demo.Exeptions.CountryNotFoundException;
import com.example.demo.Models.Country;
import com.example.demo.Models.CountrySearch;
import com.example.demo.Repository.CountryRepository;
import com.example.demo.Repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/world")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public String selectContinent(Model model) {
        model.addAttribute("continents", repository.getContinents());
        return "selectContinent";
    }

    @GetMapping("/list")
    public String showCountries( Model model) {
        model.addAttribute("countries",  repository.getSource());
        return "countryList";
    }

    @RequestMapping(value="/country/{code}")
    public String getCountry(Model model, @PathVariable("code") Country country) {
        if (country == null) throw new CountryNotFoundException("no found country: " + country.getCode());

        model.addAttribute("country", country);
        return "viewCountry";
    }
}