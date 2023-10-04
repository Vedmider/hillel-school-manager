package com.hillel.application.service.listener.event;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HealthStatusListener {

    @EventListener
    public void onLivenessEvent(AvailabilityChangeEvent<LivenessState> event) {
        switch (event.getState()) {
            default -> System.out.println("LivenessState changed");
        }
    }

    @EventListener
    public void onReadynessEvent(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            default -> System.out.println("ReadinessState changed");
        }
    }
}
