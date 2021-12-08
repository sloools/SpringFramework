package me.song.demospringmvc1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvent(){
        Event songEvent = Event.builder()
                .name("Spring Web Mvc with Song")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2021, 12, 06, 20, 50))
                .endDateTime(LocalDateTime.of(2021, 12, 06, 22, 50))
                .build();

        Event andrewEvent = Event.builder()
                .name("Spring Web Mvc with Andrew")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2021, 12, 06, 20, 50))
                .endDateTime(LocalDateTime.of(2021, 12, 06, 22, 50))
                .build();

        return List.of(songEvent, andrewEvent);
    }
}
