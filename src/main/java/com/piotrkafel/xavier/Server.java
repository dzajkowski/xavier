package com.piotrkafel.xavier;

import io.vertx.core.Vertx;

public class Server {

    public static void main(String[] args) {
        System.setProperty("vertx.disableFileCaching", "true");
        Vertx.vertx().createHttpServer().requestHandler(
                req -> req.response().sendFile("index.html")).listen(8080);
    }
}
