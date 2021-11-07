package com.MemoryCards.MemoryCards.service;

import com.MemoryCards.MemoryCards.model.Theme;
import com.MemoryCards.MemoryCards.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {
    private final ThemeRepository themeRepository;

    @Autowired
    public ThemeService(ThemeRepository themeRepository){
        this.themeRepository = themeRepository;
    }

    public List<Theme> findAll() {
        return themeRepository.findAll();
    }
    public Theme findById(Long id){
        return themeRepository.findById(id).get();
    }
}
