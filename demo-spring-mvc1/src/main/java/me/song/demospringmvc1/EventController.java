package me.song.demospringmvc1;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    @Autowired
    EventService eventService;

//    private final EventService eventService;

//    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @GetMapping("/events") // Meta Annotation 사용. @GetMapping이라는 어노테이션 내부에 @RequestMapping(method = RequestMethod.GET)가 포함돼있음
    public String events(Model model){
        model.addAttribute("events", eventService.getEvent());
        return "events"; // view를 찾는 keyword
    }

}
