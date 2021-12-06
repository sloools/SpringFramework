package me.song.demo;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @TimeCheck()
    public void sampleRun1(){
        try{
           Thread.sleep(3000);
            System.out.println("SampleRun1 Test 1111111111");
        }catch(Exception e){

        }
    }
    @TimeCheck
    public void sampleRun2(){
        try{
            Thread.sleep(2000);
            System.out.println("SampleRun2 Test222222222");
        }catch(Exception e){

        }
    }

    public void deleteSample(){
        System.out.println("Delete Sample ~~~~~~~~~~");
    }
}
