package com.MemoryCards.MemoryCards.repository;

import com.MemoryCards.MemoryCards.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository  extends JpaRepository<Word, Long> {
}
