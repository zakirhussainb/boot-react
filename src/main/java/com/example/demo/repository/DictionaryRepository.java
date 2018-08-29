package com.example.demo.repository;

import com.example.demo.entity.Dictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends ElasticsearchRepository<Dictionary, Long> {

}
