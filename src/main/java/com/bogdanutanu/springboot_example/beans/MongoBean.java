package com.bogdanutanu.springboot_example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import com.mongodb.DB;
import org.springframework.stereotype.Component;

@Component(value = "mongoBean")
public class MongoBean {

    private final MongoDbFactory mongo;

    @Autowired
    public MongoBean(MongoDbFactory mongo) {
        this.mongo = mongo;
    }

    public String dbName() {
        DB db = mongo.getDb();
        return db.getName();
    }

}
