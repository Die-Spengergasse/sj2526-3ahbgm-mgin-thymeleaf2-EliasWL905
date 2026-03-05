package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Autohaus;
import at.spengergasse.spring_thymeleaf.entities.AutohausRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/autohausmanager")
public class AutohausController {
    private final AutohausRepository autohausRepository;

    public AutohausController(AutohausRepository autohausRepository) {
        this.autohausRepository = autohausRepository;
    }

    @GetMapping("/list")
    public String autos(Model model) {
        model.addAttribute("Autos", autohausRepository.findAll());
        return "carlist";
    }

    @GetMapping("/add")
    public String addAuto(Model model) {
        model.addAttribute("Autos", new Autohaus());
        return "add_car";
    }

    @PostMapping("/add")
    public String saveAuto(@ModelAttribute("Autos") Autohaus autohaus) {
        autohausRepository.save(autohaus);
        return "redirect:/autohausmanager/list";
    }
    @GetMapping("/edit")
    public String editForm(@RequestParam("id") int id, Model model) {
        Autohaus autohaus = autohausRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ungueltige ID: " + id));
        model.addAttribute("Autos", autohaus);
        return "edit";
    }

    @PostMapping("/edit")
    public String editSave(@RequestParam("id") int id,
                           @ModelAttribute("Autos") Autohaus autohaus) {
        autohaus.setId(id);
        autohausRepository.save(autohaus);
        return "redirect:/autohausmanager/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        autohausRepository.deleteById(id);
        return "redirect:/autohausmanager/list";
    }


}
