package com.myprojects.configuration;

import com.myprojects.domain.DefaultLogger;
import com.myprojects.domain.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfiguration {

    @Bean
    public Logger logger() {
        return new DefaultLogger();
    }

}
