package com.MemoryCards.MemoryCards.controller;

import com.MemoryCards.MemoryCards.model.Theme;
import com.MemoryCards.MemoryCards.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ThemeController {

    private final ThemeService themeService;

    @Autowired
    public ThemeController(ThemeService themeService) {
        this.themeService = themeService;
    }

    @GetMapping("/themes")
    public String findAll(Model model) {
        List<Theme> themes = themeService.findAll();
        model.addAttribute("themes", themes);
        return "themes-list";
    }

    @RequestMapping(value = {"/selectTheme"}, method = RequestMethod.POST)
    public String findAllById(String selectedTheme, Model model) {
        Theme themes = themeService.findById(Long.parseLong(selectedTheme));
        System.out.println(themes);
        model.addAttribute("themes", themes);
        return "theme-choosen-list";
    }


}
