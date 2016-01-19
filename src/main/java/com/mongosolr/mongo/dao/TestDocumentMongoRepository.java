package com.mongosolr.mongo.dao;

import com.mongosolr.mongo.model.TestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by hguo on 1/18/16.
 */
@Repository("testDocumentMongoRepository")
@SuppressWarnings("all")
@RepositoryRestResource(collectionResourceRel = "document", path = "document-mongo")
public interface TestDocumentMongoRepository extends MongoRepository<TestDocument, String> {
}
