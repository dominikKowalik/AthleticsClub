package com.kowalik.dominik.web_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by dominik on 2016-12-26.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.kowalik.dominik.web")
public class WebConfig extends WebMvcConfigurerAdapter {
}
