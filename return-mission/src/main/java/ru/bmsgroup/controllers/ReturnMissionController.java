package ru.bmsgroup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bmsgroup.MissionService;

@RestController
public class ReturnMissionController {
    @Autowired
    MissionService missionService;

    @GetMapping("/goHome")
    public String goHome() {
        return missionService.homeward();
    }
}
