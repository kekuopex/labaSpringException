package com.example.demo.Exeptions;

import com.example.demo.Models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Country")  // 404
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(String errorMessage) {

        super(errorMessage);
    }

    public CountryNotFoundException() {

        super();
    }

}
