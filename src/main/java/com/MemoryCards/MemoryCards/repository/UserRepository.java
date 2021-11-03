package com.MemoryCards.MemoryCards.repository;

import com.MemoryCards.MemoryCards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
