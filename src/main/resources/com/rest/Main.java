
package com.rest;
import java.io.IOException;
import java.net.SocketException;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;



import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {


	public static void main(String[] args) throws SocketException {
		
		//docker容器中的默认0.0.0.0，设定端口为8998
		final URI uri = UriBuilder.fromUri("http://0.0.0.0/").port(8998).build();

		final ResourceConfig config = new ResourceConfig();
		//
		config.packages("com.rest");
		//Grizzly
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
