package com.cloudlending;

public class App {
    public static void main(String[] args) {

        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://admin2020:<password>@clustercls-t8ggf.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");

    }
}
