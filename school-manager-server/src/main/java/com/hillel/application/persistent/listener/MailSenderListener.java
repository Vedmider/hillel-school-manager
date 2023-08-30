package com.hillel.application.persistent.listener;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class MailSenderListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        System.out.println("email to Peppi long socks");
    }


    @PostConstruct
    public boolean check() {
        return true;
    }


    @PreDestroy
    public boolean destroy(){
        return true;
    }
}
