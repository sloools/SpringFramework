package me.song.demospringmvc1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ConfigTest {

    @Autowired
    Event event;

    @Test
    @DisplayName("Config Test")
    public void test(){
        System.out.println(event.getName());
    }

}
