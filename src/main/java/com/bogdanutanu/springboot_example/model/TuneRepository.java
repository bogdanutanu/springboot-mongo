package com.bogdanutanu.springboot_example.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TuneRepository extends MongoRepository<Tune, Long> {

    Tune findByTitle(String title);

}
