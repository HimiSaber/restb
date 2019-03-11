package com.rest;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;



import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final URI uri = UriBuilder.fromUri("http://localhost/").port(8998).build();
		final ResourceConfig config = new ResourceConfig();
		config.packages("com.rest");
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		Runtime.getRuntime().addShutdownHook(new Thread() {
		    @Override
		    public void run() {
		        server.shutdown();
		    }
		});
		try {
		    server.start();
		} catch (IOException e) {
		    e.printStackTrace();
		    System.exit(1);
		}
	}

}
