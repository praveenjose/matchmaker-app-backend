package com.heartbeats.matchmaker.repository;

import com.heartbeats.matchmaker.model.Profile;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchRepositoryImpl implements SearchRepository {
    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Override
    public List<Profile> findByText(String text) {

        final List<Profile> profiles = new ArrayList<>();

        MongoDatabase database = client.getDatabase("appvoyager");
        MongoCollection<Document> collection = database.getCollection("Profile");

        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("interestedin", "bio", "tags")))),
                new Document("$sort",
                        new Document("exp", 1L)),
                new Document("$limit", 5L)));

        result.forEach(doc -> profiles.add(converter.read(Profile.class,doc)));

        return profiles;
}
}
