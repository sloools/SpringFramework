package me.song.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {

    @Around("@annotation(TimeCheck)")
    public Object checkRunningTime(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object rtn = pjp.proceed();
        System.out.println("Method Running Time is : " + (System.currentTimeMillis() - begin));
        return rtn;
    }
}
