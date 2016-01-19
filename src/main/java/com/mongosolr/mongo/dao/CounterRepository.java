package com.mongosolr.mongo.dao;

import com.mongosolr.mongo.model.Counter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hguo on 1/18/16.
 */
@Repository("counterRepository")
public interface CounterRepository extends MongoRepository<Counter, String> {

}
