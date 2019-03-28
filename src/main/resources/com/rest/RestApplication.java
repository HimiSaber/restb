package com.rest;

import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * json
 * @author 13996
 *
 */
public class RestApplication extends ResourceConfig {
	public RestApplication() {
		packages("com.rest.resources");
		register(JacksonJsonProvider.class);
	}
}
