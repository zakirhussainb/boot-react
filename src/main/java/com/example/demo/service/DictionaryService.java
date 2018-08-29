package com.example.demo.service;

import com.example.demo.entity.Dictionary;

import java.util.List;

public interface DictionaryService {

    List<Dictionary> findManyByWord(String word);

}
