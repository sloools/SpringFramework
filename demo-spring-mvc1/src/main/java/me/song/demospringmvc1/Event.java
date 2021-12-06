package me.song.demospringmvc1;

import lombok.*;

import java.time.LocalDateTime;

// lombok annotation : compile 시점에 해당 어노테이션 기능을 추가하여 class파일 생성
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // builder 패턴을 사용하여 객체를 생성하며 객체 생성 후 setter를 통해서 접근제한을 할 수 있음 => type safe
public class Event {

    private String name;

    private int limitOfEnrollment;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;
}
