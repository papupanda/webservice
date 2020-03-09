package com.nt.AppConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ServiceConfig.class,ConsumerIntegrationConfig.class})
public class RootConfig {

}
