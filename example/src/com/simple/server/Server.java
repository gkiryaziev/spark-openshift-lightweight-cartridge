package com.simple.server;

import static spark.Spark.*;
import java.util.Optional;

public class Server {
    public static void main(String[] args) {

        String ipAddress = Optional.ofNullable(System.getenv("OPENSHIFT_DIY_IP")).orElse("0.0.0.0");
        int ipPort = Integer.parseInt(Optional.ofNullable(System.getenv("OPENSHIFT_DIY_PORT")).orElse("8008"));

        ipAddress(ipAddress);
        port(ipPort);

        get("/", (req, res) -> {
            return "Hello World!";
        });

    }
}
