package com.mongosolr.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hguo on 1/19/16.
 */
@Document(collection = "counter")
@SuppressWarnings("all")
public class Counter {
    @Id
    private String id;

    private long seq;

    public static final Counter START = new Counter() {{
        setSeq(0);
    }};

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
