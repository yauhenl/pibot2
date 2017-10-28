package com.yauhenl.pibot;

import com.yauhenl.pibot.web.BotController;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

// run with --add-modules java.activation,java.xml.bind
public class Application {
    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new ResourceConfig(BotController.class);
        JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
