package com.hillel.application.infrastructure.configuration;

import com.hillel.application.infrastructure.properties.SchoolProperties;
import com.hillel.application.persistent.listener.MailSenderListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SchoolProperties.class)
public class AppConfiguration {

    @Autowired
    private SchoolProperties schoolProperties;


    @Bean
    public MailSenderListener mailSenderListener() {
        return new MailSenderListener();
    }
}
