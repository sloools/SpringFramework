package me.song.demospringmvc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;

@Configuration
public class EventConfig {
    @Bean
    @Profile("test")
    public Event testEventBean(){
        Event testEvent = Event.builder()
                .name("Profile Test ")
                .limitOfEnrollment(2)
                .startDateTime(LocalDateTime.of(2021, 12, 06, 20, 50))
                .endDateTime(LocalDateTime.of(2021, 12, 06, 22, 50))
                .build();
        return testEvent;
    }

    @Bean
    @Profile("local")
    public Event localEventBean(){
        Event localEvent = Event.builder()
                .name("Profile Local ")
                .limitOfEnrollment(3)
                .startDateTime(LocalDateTime.of(2021, 12, 06, 20, 50))
                .endDateTime(LocalDateTime.of(2021, 12, 06, 22, 50))
                .build();
        return localEvent;
    }
}
