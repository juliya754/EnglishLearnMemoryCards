package com.MemoryCards.MemoryCards.controller;

import com.MemoryCards.MemoryCards.model.User;
import com.MemoryCards.MemoryCards.model.Word;
import com.MemoryCards.MemoryCards.service.UserService;
import com.MemoryCards.MemoryCards.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WordController {
    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/words")
    public String findAll(Model model) {
        List<Word> words = wordService.findAll();
        model.addAttribute("words", words);
        return "word-list";
    }

    @GetMapping("/word-create")
    public String createWordForm(Word word) {
        return "word-create";
    }

    @PostMapping("/word-create")
    public String CreateWord(Word word) {
        wordService.saveWord(word);
        return "redirect:/words";
    }

    @GetMapping("word-delete/{id}")
    public String deleteWord(@PathVariable("id") Long id){
        wordService.deleteById(id);
        return "redirect:/words";
    }

    @GetMapping("word-update/{id}")
    public String updateWordForm(@PathVariable("id") Long id, Model model){
        Word word = wordService.findById(id);
        model.addAttribute("word", word);
        return "/word-update";
    }
    @PostMapping("/word-update")
    public String updateWord(Word word){
        wordService.saveWord(word);
        return "redirect:/words";
    }
}
