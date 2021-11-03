package com.MemoryCards.MemoryCards.service;

import com.MemoryCards.MemoryCards.model.Word;
import com.MemoryCards.MemoryCards.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    private final WordRepository wordRepository;

    @Autowired
    public WordService(WordRepository wordRepository){
        this.wordRepository = wordRepository;
    }

    public Word findById(Long id){
        return wordRepository.getById(id);
    }

    public List<Word> findAll(){ return wordRepository.findAll(); }

    public Word saveWord(Word word){
        return wordRepository.save(word);
    }

    public void deleteById(Long id){
        wordRepository.deleteById(id);
    }
}
