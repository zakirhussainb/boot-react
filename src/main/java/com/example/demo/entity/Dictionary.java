package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dictionary {

    private @Id @GeneratedValue
    Long id;

    private String word;
    private String meaning;

    public Dictionary() {
    }

    public Dictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
}
