package com.dnd_cs_dr.dndcsdr.Controller;

import com.dnd_cs_dr.dndcsdr.PlayerCharacter.PlayerCharacter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        PlayerCharacter playerCharacter = new PlayerCharacter();

        model.addAttribute("playerCharacter", playerCharacter);

        return "index";
    }

    @PostMapping("/character")
    public String createCharacter(
            @ModelAttribute PlayerCharacter playerCharacter,
            Model model) {

        model.addAttribute("playerCharacter", playerCharacter);

        return "character";
    }
}