package com.mongosolr.service;

import com.mongosolr.mongo.dao.CounterRepository;
import com.mongosolr.mongo.model.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hguo on 1/19/16.
 */
@Service("counterService")
public class CounterService {
    @Autowired
    private CounterRepository counterRepository;

    public synchronized long getNextSequence() {
        Counter counter = counterRepository.findAll().get(0);
        long count = counter.getSeq() + 1;
        counter.setSeq(count);
        counterRepository.save(counter);
        return count;
    }

    public void reset() {
        counterRepository.deleteAll();
        counterRepository.save(Counter.START);
    }
}
