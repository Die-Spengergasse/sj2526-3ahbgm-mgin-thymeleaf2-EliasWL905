package at.spengergasse.spring_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloController {

    @GetMapping({"/autohausmanager", "/", "/index"})
    public  String index(Model model) {
        // add date to model
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        model.addAttribute("currentDateTime", dtf.format(LocalDateTime.now()));
        // gibt uns das Template index.html zurück, das wir in src/main/resources/templates/ angelegt haben
        // Endpoints geben immer den Namen des Templates zurück, das sie rendern sollen
        return "index";
    }
}
