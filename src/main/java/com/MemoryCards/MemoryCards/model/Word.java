package com.MemoryCards.MemoryCards.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="word")
    private String wordvalue;

    @Column(name="definition")
    private String definition;
}
