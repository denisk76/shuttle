package ru.bmsgroup;

public class TestMission implements MissionService {
    private String pilotName;

    public TestMission(String pilotName) {
        this.pilotName = pilotName;
    }

    @Override
    public String startTheEngine() {
        return pilotName + " test start engine";
    }

    @Override
    public String takeoff() {
        return "Test takeoff";
    }

    @Override
    public String flight() {
        return "Test flight";
    }

    @Override
    public String landing() {
        return "Test landing";
    }
}
