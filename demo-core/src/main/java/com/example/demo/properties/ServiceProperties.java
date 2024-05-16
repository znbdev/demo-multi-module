package com.example.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("service")
public class ServiceProperties {

	/**
	 * A message for the service.
	 */
	private String message;

}
