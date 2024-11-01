package com.example.demo.Controllers;


import com.example.demo.Exeptions.CountryNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
    // Обработка исключения CountryNotFoundException
    @ExceptionHandler(CountryNotFoundException.class)
    public String handleCountryNotFoundException(CountryNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "countryError"; // Убедитесь, что
    }

    // Обработка ошибки 404 - страницы не существует
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleNotFoundError(NoHandlerFoundException ex, Model model) {
        model.addAttribute("errorMessage", "Страница не найдена. Проверьте правильность URL.");
        return "error"; // Имя шаблона представления для ошибок 404
    }
}
