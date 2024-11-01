package com.example.demo.Components;

import com.example.demo.Exeptions.CountryNotFoundException;
import com.example.demo.Models.Country;
import com.example.demo.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CountryConverter implements Converter<String, Country> {

    @Autowired
    CountryRepository cr;

    @Override
     public Country convert(String code) {
        Country country = cr.findByCode(code);
        if (country == null) throw new CountryNotFoundException("no found country: " + country.getCode());

        return cr.findByCode(code);
     }
}
