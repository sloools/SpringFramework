package me.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class appRunner implements ApplicationRunner {

    @Autowired
    SampleAspect sampleAspect;

    @Autowired
    SampleService sampleService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================================");
        sampleService.sampleRun1();
        sampleService.sampleRun2();
        sampleService.deleteSample();
    }
}
