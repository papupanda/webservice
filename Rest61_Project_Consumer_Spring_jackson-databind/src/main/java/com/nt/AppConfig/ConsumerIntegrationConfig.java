package com.nt.AppConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.Integration")
public class ConsumerIntegrationConfig {

}
