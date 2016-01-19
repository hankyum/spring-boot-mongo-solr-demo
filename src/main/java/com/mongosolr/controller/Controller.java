package com.mongosolr.controller;

import com.mongosolr.mongo.model.TestDocument;
import com.mongosolr.service.TestDocumentService;
import com.mongosolr.solr.model.TestSolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hguo on 1/15/16.
 */
@RestController
@SuppressWarnings("all")
public class Controller {
    @Autowired
    private TestDocumentService testDocumentService;

    @RequestMapping(
            path = "createDocument",
            method = RequestMethod.POST,
            consumes = {"application/x-www-form-urlencoded;charset=UTF-8"},
            produces = "application/json;charset=UTF-8")
    @ResponseBody
    public TestSolrDocument createDocument(TestDocument document) {
       return testDocumentService.saveMongoAndIndex(document);
    }

    @RequestMapping(path = "clearAll", method = RequestMethod.GET)
    public String clearAll() {
        testDocumentService.clear();
        return "Clear All Success";
    }

    @RequestMapping(path = "indexMongo", method = RequestMethod.GET)
    public String indexMongo() {
        testDocumentService.indexMongo();
        return "Index Mongo Success";
    }

    @RequestMapping(path = "createDocument", method = RequestMethod.GET)
    public ModelAndView newDocument() {
        ModelAndView view = new ModelAndView("/createDocumentForm");
        view.addObject(new TestDocument());
        return view;
    }
}
