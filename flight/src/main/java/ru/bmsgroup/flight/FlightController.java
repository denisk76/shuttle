package ru.bmsgroup.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bmsgroup.MissionService;

@RestController
public class FlightController {
    @Autowired
    MissionService missionService;

    @GetMapping("/flight")
    public String flight() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(missionService.startTheEngine()).append(" <br> ").append(System.lineSeparator())
                .append(missionService.takeoff()).append(" <br> ").append(System.lineSeparator())
                .append(missionService.flight()).append(" <br> ").append(System.lineSeparator())
                .append(missionService.landing());
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
